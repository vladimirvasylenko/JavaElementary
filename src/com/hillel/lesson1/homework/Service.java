package com.hillel.lesson1.homework;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Service {

    boolean checkUser(Master user) throws IOException;

    void writeUser(Master user) throws IOException;
}
