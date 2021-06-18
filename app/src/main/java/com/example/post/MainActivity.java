package com.example.post;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.post.AIP.ApiService;
import com.example.post.Model.User;
import com.example.post.databinding.ActivityMainBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.POST;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               sendPost();
            }
        });

    }

    private void sendPost() {
        User user = new User(10, "Kiet" , "kiet123456" , 17 , "Nguyen Tuan Kiet");
        ApiService.apiService.sendAIP(user).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Toast.makeText(MainActivity.this , "Call Success" , Toast.LENGTH_LONG).show();
                User user1 = response.body();
                if(user1!=null)
                {
                    binding.tvResult.setText(user1.toString());
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(MainActivity.this , "Call Fail" , Toast.LENGTH_LONG).show();
            }
        });
    }
}