package com.hillel.lesson1.classwork;

public class Parrot implements AnimalInterface{
    @Override
    public void run() {
        System.out.println("run parrot");
    }

    @Override
    public void voice() {
        System.out.println("voice parrot");

    }
}
