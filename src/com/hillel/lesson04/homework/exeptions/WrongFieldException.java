package com.hillel.lesson04.homework.exeptions;

public class WrongFieldException extends Exception {
    public WrongFieldException() {
        super("The account ID length is more, than 10 symbols");
    }
}
