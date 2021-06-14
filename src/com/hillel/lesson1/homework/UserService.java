package com.hillel.lesson1.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public interface UserService {

    static String filepath = "/Users/awsome/IdeaProjects/JavaElementary2/src/com/hillel/lesson1/homework/mails";

    public static boolean checkUser(Master user) throws FileNotFoundException {

        FileReader fileReader = new FileReader(filepath);
        Scanner scanner = new Scanner(fileReader);

        if (user.getMail() == scanner.nextLine()){
            return true;
        } else {
            return false;}
    }


}
