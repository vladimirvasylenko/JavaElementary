package com.hillel.lesson01.homework;

import java.io.IOException;

public class UserService extends ServiceAbstractClass {

    private String file = "/Users/awsome/IdeaProjects/JavaElementary/src/resources/Data.txt";

    public UserService(String file) {
        this.file = file;
    }

    @Override
    public boolean checkUser(Master user) throws IOException {
        return super.checkUser(user);
    }

    @Override
    public void writeUser(Master user) {
        System.out.println("can't write with UserService");
    }
}
