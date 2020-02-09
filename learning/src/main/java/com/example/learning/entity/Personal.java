package com.example.learning.entity;

public class Personal{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Personal(String name, String id) {
        this.name = name;
        this.id = id;
    }

    String id;

}
