package com.hillel.lesson6.homework;

import com.hillel.lesson6.homework.exceptions.StringFormatException;
import com.hillel.lesson6.homework.utils.ChekWithRegExr;
import com.hillel.lesson6.homework.utils.StringHelper;

public class Main {
    public static void main(String[] args) throws StringFormatException {

        char[] charArray = {'h','e','l','l','o'};
        String fuck = "world";
        StringHelper stringHelper = new StringHelper();
        System.out.println(stringHelper.arrayToStringWithCheck(fuck, charArray));

        String phone = "+38(093)777-56-57";
        String email = "v-vasylenko@gmail.com";
        String date = "11.12.1990";

        ChekWithRegExr chekWithRegExr = new ChekWithRegExr();
        chekWithRegExr.chekPhoneNumber(phone);
        chekWithRegExr.chekEmail(email);
        chekWithRegExr.chekDateOfBirth(date);



    }
}
