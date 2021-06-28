package com.hillel.lesson04.homework;

import com.hillel.lesson04.homework.exeptions.WrongFieldException;
import com.hillel.lesson04.homework.utils.HelperClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongFieldException {

        Scanner scanner = new Scanner(System.in);
        HelperClass helperClass = new HelperClass();

        System.out.println("Please - enter you Account ID: ");
        String clientId = scanner.nextLine();

        while (clientId.length() != 10) {
            try {
                helperClass.clientIdChecker(clientId);

            } catch (WrongFieldException e) {
                e.printStackTrace();
            }
        }

    }
}
