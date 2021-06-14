package com.hillel.lesson1.homework;

import java.io.*;


public class AdminService implements Service {

    static String file = "C:\\Users\\vasyl\\IdeaProjects\\JavaElementary\\src\\com\\hillel\\lesson1\\homework\\Data.txt";

    @Override
    public boolean checkUser(Master user) throws IOException {

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String emailLine = user.getMail();
        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals(emailLine)) {
                System.out.println("male is found");
                return true;
            }
        }
        bufferedReader.close();
        fileReader.close();
        System.out.println("male isn't found");
        return false;
    }

    @Override
    public void writeUser(Master user) throws IOException {

        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(user.getName() + "\n");
        fileWriter.write(user.getSurname() + "\n");
        fileWriter.write(user.getAge() + "\n");
        fileWriter.write(user.getMail() + "\n");
        fileWriter.write(user.getPassword() + "\n");
        fileWriter.write(user.getRole() + "\n");

        fileWriter.close();

        System.out.println("data is writing");
    }
}
