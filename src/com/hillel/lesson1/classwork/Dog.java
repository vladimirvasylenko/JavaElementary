package com.hillel.lesson1.classwork;

public class Dog extends AbstractAnimal implements AnimalInterface{

    @Override
    public void voice() {
        System.out.println("dog voice");

    }
}
