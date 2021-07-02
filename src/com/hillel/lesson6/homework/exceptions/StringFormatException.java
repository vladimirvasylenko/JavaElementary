package com.hillel.lesson6.homework.exceptions;

public class StringFormatException extends Exception{
    public StringFormatException(){
        super("This string has some empty symbols");
    }
}
