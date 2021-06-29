package com.hillel.lesson04.homework;

import com.hillel.lesson04.homework.entities.Client;
import com.hillel.lesson04.homework.exeptions.UserExpectedError;
import com.hillel.lesson04.homework.exeptions.WrongFieldException;
import com.hillel.lesson04.homework.exeptions.WrongSumException;
import com.hillel.lesson04.homework.services.TransactionService;
import com.hillel.lesson04.homework.utils.HelperClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserExpectedError {

        Scanner scanner = new Scanner(System.in);
        HelperClass helperClass = new HelperClass();
        TransactionService transactionService = new TransactionService();
        Client senderClient = new Client("0","vasylenko","0",0);

        System.out.println("Please - enter sender Account ID: ");
        String senderClientId = scanner.nextLine();

        while (senderClientId.length() != 10) {
            try {
                helperClass.clientIdChecker(senderClientId);

            } catch (WrongFieldException e) {
//                e.printStackTrace();
                System.out.println("Incorrect Account ID");
                System.out.println("Please, write it again");
                senderClientId = scanner.nextLine();
            }
        }
        senderClient.setClientId(senderClientId);

        System.out.println("Please - enter receiver Account ID: ");
        String receiverClientId = scanner.nextLine();

        while (receiverClientId.length() != 10) {
            try {
                helperClass.clientIdChecker(receiverClientId);

            } catch (WrongFieldException e) {
//                e.printStackTrace();
                System.out.println("Incorrect Account ID");
                System.out.println("Please, write it again");
                receiverClientId = scanner.nextLine();
            }
        }

        System.out.println("Please - enter sum of transaction: ");
        double sum = scanner.nextDouble();

        while (sum > 1000d){
            try {
                helperClass.sumChecker(sum);
            } catch (WrongSumException e) {
//                e.printStackTrace();
                System.out.println("Incorrect sum");
                System.out.println("Please, write it again");
                sum = scanner.nextDouble();
            }
        }

        transactionService.moneySend(senderClient,receiverClientId);
        System.out.println("Money already sent");

    }
}
