package com.hillel.lesson02.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class InitializationData {

    public Information initializationData() {

        Information information = new Information();


        for (int i = 1; i < 31; i++) {

            String name = "name" + i;
            information.getNameList().add(name);

            String mail = "mail" + i + "@gmail.com";
            information.getMailSet().add(mail);

            information.getInformationMap().put(mail, name);
        }

        for (int i = 1; i < 11; i++) {

            String testName = "testName";
            information.getNameList().add(testName);

            String testMail = "testMail";
            information.getMailSet().add(testMail);

            information.getInformationMap().put(testMail, testName);
        }

        if (deDuplicate(information) == true) {
            System.out.println("the size of collection is same");
            return information;
        }
        System.out.println("the size of collection isn't same");
        return information;

    }

    private boolean deDuplicate(Information information) {

        System.out.println(information.getNameList().size());

        List<String> deDuplicateNameList = new ArrayList<>(new HashSet<>(information.getNameList()));

        System.out.println(deDuplicateNameList.size());


        if (deDuplicateNameList.equals(information.getMailSet()) && information.getMailSet().equals(information.getInformationMap())) {
            return true;
        } return false;


    }

}
