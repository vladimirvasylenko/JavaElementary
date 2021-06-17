package com.hillel.lesson02.homework;

import java.util.Map;

public class InitializationData {

    public Information initializationData() {

        Information information = new Information();


        for (int i = 1; i < 32 ; i++) {

            String name = "name" + i;
            information.getNameList().add(name);

            String mail = "mail" + i;
            information.getMailSet().add(mail);

            information.getInformationMap().put(mail, name);
        }

        return information;
    }
}
