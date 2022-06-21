package com.web.springboot.demo.entities;

public class User {
    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private long id;
    private String name;
    private String username;


    public User(long id, String name, String username) {
        this.id = id;
        this.name = name;
        this.username = username;
    }
}

