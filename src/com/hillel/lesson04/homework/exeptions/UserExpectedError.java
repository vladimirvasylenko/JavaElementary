package com.hillel.lesson04.homework.exeptions;

public class UserExpectedError extends RuntimeException {
    public UserExpectedError() {
        super("Sender and receiver account ID is same");
    }
}
