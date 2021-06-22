package com.hillel.lesson02.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    private static Information addMoreData(List<Number> primitiveList, Information information){

        Iterator<Number> iterator = primitiveList.iterator();
        Iterator<String> informationMapIterator = information.getInformationMap().keySet().iterator();


        while (iterator.hasNext()){

            String name = iterator.next().toString();
            String mail = iterator.next().toString() + "@mail.ua";

            information.getNameList().add(name);
            information.getMailSet().add(mail);
            information.getInformationMap().put(mail, name);

            while (informationMapIterator.hasNext()){
                if (informationMapIterator.next() == mail){

                }
            }


        }


        return information;
    }

    public static void main(String[] args) {

//        InitializationData initializationData = new InitializationData();
//        initializationData.initializationData();
//        Information information = initializationData.initializationData();
//        System.out.println(information.getNameList());

        List<Number> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println(myList);




    }


}
