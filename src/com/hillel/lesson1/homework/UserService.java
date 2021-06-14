package com.hillel.lesson1.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserService implements Service {

    static String file = "C:\\Users\\vasyl\\IdeaProjects\\JavaElementary\\src\\com\\hillel\\lesson1\\homework\\Data.txt";

    @Override
    public boolean checkUser(Master user) throws IOException {

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String emailLine = user.getMail();

        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals(emailLine)) {
                System.out.println("male is found");
                return true;
            }
        }
        bufferedReader.close();
        fileReader.close();
        System.out.println("male isn't found");
        return false;
    }

    @Override
    public void writeUser(Master user) {
        System.out.println("can't write with UserService");
    }
}
