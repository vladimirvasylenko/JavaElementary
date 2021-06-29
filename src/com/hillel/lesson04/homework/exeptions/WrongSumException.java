package com.hillel.lesson04.homework.exeptions;

public class WrongSumException extends Exception {
    public WrongSumException() {
        super("The client sum more, than 1000");
    }
}
