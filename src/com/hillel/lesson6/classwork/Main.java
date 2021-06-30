package com.hillel.lesson6.classwork;

import com.hillel.lesson05.classwork.Client;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("name", "surname");
        Client client2 = new Client("name", "surname");

        Map<Client, String> map = new HashMap<>();

        map.put(client1, "test");
        System.out.println(map);
        System.out.println(map.get(client2));

        Pattern pattern = Pattern.compile("/d");
        Matcher matcher = pattern.matcher("4312");
    }
}
