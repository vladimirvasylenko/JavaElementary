package com.hillel.lesson01.homework;

public class User extends Master {

    public User(String name, String surname, int age, String mail, String password, String role) {
        super(name, surname, age, mail, password, "USER");
    }
}
