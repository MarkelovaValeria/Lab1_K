package com.example.lab1_k.Lab2;

public class User {
    private String surname;
    private String name;


    public User( String surname, String name){
        this.surname = surname;
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
}
