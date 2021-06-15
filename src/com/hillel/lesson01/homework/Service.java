package com.hillel.lesson01.homework;

import java.io.IOException;

public interface Service {

    boolean checkUser(Master user) throws IOException;

    void writeUser(Master user) throws IOException;
}
