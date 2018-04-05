package com.codeup.adlister;

public class Config {

    private String url = "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    private String username = "user2";
    private String password = "codeup";


    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
