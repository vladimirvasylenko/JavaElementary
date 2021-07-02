package com.hillel.lesson6.homework;

import com.hillel.lesson6.homework.exceptions.StringFormatException;
import com.hillel.lesson6.homework.utils.StringHelper;

public class Main {
    public static void main(String[] args) throws StringFormatException {
        char[] charArray = {'a','m','n'};
        String fuck = "fuck";
        StringHelper stringHelper = new StringHelper();
        stringHelper.arrayToStringWithCheck(fuck, charArray);

    }
}
