package org.example.util;

import org.example.model.User;
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
        } else {
        System.out.println("Ты чего творишь, нормально же общались - введи число!");
        return false; }
    }

    public boolean processIntValue(int successNumb, int numb, User user) {
        System.out.println(String.format("Загаданное число: " + successNumb));
        System.out.println(String.format("Твое число: " + numb));

        if (successNumb == numb) {
            System.out.println(String.format("Верно, %s! Ты молодец", user.getName()));
            return true;
        }
        System.out.println("Попробуй ещё раз");
        return false;
    }

    public User buildUser() {
        User user = new User();
        System.out.println("Введи имя: ");
        user.setName(sc.nextLine());
        System.out.println("Введи фамилию: ");
        user.setSurname(sc.nextLine());
        System.out.println("Введи возраст: ");

        boolean isSuccessAge = false;

        while (!isSuccessAge) {
            if (isInt()) {
                user.setAge(Integer.parseInt(sc.nextLine()));
                isSuccessAge = true;
            } else {
                System.out.println("Введи число: ");
                isSuccessAge = isInt() ? isInt() : processNoIntValue();
            }
        }
        boolean isSuccessGrow = false;

        while (!isSuccessGrow) {
            if (isInt()) {
                user.setGrow(Integer.parseInt(sc.nextLine()));
                isSuccessGrow = true;
            } else {
                getClass().desiredAssertionStatus();
            }
        }
        return user;
    }
}
