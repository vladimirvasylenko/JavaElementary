package com.hillel.lesson1.classwork;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();

        Animal cat = new Cat();
        cat.voice();
    }
    // полиморфизм это - один интерфейс и множество реализаций

    //интерфейс - контракт для класса
}
