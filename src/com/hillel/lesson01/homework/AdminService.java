package com.hillel.lesson01.homework;

import java.io.*;


public class AdminService extends ServiceAbstractClass {

    @Override
    public boolean checkUser(Master user) throws IOException {
        return super.checkUser(user);
    }

    @Override
    public void writeUser(Master user) throws IOException {

        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(user.getName() + "\n");
        fileWriter.write(user.getSurname() + "\n");
        fileWriter.write(user.getAge() + "\n");
        fileWriter.write(user.getMail() + "\n");
        fileWriter.write(user.getPassword() + "\n");
        fileWriter.write(user.getRole() + "\n");

        fileWriter.close();

        System.out.println("data is writing");
    }
}
