package com.hillel.lesson1.homework;

public class User extends Master implements UserService{

    public User(String name, String surname, int age, String mail, String password, String role) {
        super(name, surname, age, mail, password, "USER");
    }




}
