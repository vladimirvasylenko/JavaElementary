package com.hillel.lesson01.homework;

public class Admin extends Master {

    public Admin(String name, String surname, int age, String mail, String password, String role) {
        super(name, surname, age, mail, password, "ADMIN");
    }
}
