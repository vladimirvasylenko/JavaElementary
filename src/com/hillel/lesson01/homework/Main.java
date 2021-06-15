package com.hillel.lesson01.homework;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        User user = new User("Vladimir", "Vasylenko", 26, "vasylenko@mail.ua", "321", "u");
        Admin admin = new Admin("Andrey", "Yashin", 20, "yashin@mail.ua", "123", "a");

        UserService userService = new UserService("/Users/awsome/IdeaProjects/JavaElementary/src/resources/Data.txt");
        AdminService adminService = new AdminService("/Users/awsome/IdeaProjects/JavaElementary/src/resources/Data.txt");

        userService.writeUser(user);
        adminService.writeUser(user);
        adminService.writeUser(admin);
        userService.checkUser(admin);
        adminService.checkUser(user);

    }
}
