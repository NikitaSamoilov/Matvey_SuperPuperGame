package org.example.util;

import java.util.Scanner;

public class CheckNumber {

    public Scanner scanner;

    boolean checkNumber = false;

    public boolean checkNumber() {

        while (checkNumber) ;
        {
            if ("exit".equals(scanner.nextLine())) {
                return true;
            } else {
                System.out.println("Ты чего творишь, нормально же общались - введи число!");
                return false;
            }
        }
    }
}
