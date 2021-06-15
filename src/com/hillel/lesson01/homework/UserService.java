package com.hillel.lesson01.homework;

import java.io.IOException;

public class UserService extends ServiceAbstractClass {

    @Override
    public void writeUser(Master user) {
        System.out.println("can't write with UserService");
    }
}
