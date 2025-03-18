package org.example.util;

import java.util.Scanner;

public class GameHelper {

    private final Scanner sc;

    public GameHelper(Scanner sc) {
        this.sc = sc;
    }

    public boolean isInt() {
        return sc.hasNextInt();
    }

    public int readNumb() {
        return Integer.parseInt(sc.nextLine());
    }

    public boolean processNoIntValue() {
        if ("exit".equals(sc.nextLine())) {
            return true;
        }
        System.out.println("Ты чего творишь, нормально же общались - введи число!");
        return false;
    }

    public boolean processIntValue(int successNumb, int numb) {
        System.out.println(String.format("Загаданное число: " + successNumb));
        System.out.println(String.format("Твое число: " + numb));

        if (successNumb == numb) {
            System.out.println("Верно! Ты молодец\n");
            return true;
        }
        System.out.println("Попробуй ещё раз\n");
        return false;
    }
}
