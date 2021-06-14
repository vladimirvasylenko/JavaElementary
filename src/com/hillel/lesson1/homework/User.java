package com.hillel.lesson1.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class User extends Master {

    public User(String name, String surname, int age, String mail, String password, String role) {
        super(name, surname, age, mail, password, "USER");
    }
}
