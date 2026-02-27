package com.mycompany.firstproject.Object_Oriented_Programming.Interface.mytubeProject;

public class User2018 implements User {
    private String email;

    public User2018(String email) {
        this.email = email;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}
