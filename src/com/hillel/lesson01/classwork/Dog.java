package com.hillel.lesson01.classwork;

public class Dog extends AbstractAnimal implements AnimalInterface{

    @Override
    public void voice() {
        System.out.println("dog voice");

    }
}
