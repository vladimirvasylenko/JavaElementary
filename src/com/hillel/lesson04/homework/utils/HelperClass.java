package com.hillel.lesson04.homework.utils;

import com.hillel.lesson04.homework.entities.Client;
import com.hillel.lesson04.homework.exeptions.WrongFieldException;
import com.hillel.lesson04.homework.exeptions.WrongSumException;

public class HelperClass {

    public void clientIdentifierChecker(Client client) throws WrongFieldException {


    }

    public void sumChecker(Client client) throws WrongSumException{

        try{
            if (client.getSum() == 10000){

            }
        } catch () throw WrongSumException;
    }
}
