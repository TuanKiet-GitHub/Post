package com.example.post.Model;

public class User {
    private Integer userId ;
    private String name ;
    private String password;
    private Integer id;
    private String body ;

    public User(Integer userId, String name, String password, Integer id, String body) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.id = id;
        this.body = body;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", body='" + body + '\'' +
                '}';
    }
}
