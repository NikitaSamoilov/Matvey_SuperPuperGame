package org.example.model;

import java.util.Scanner;

public class User {
    public final Scanner scanner;

    public User (Scanner scanner) {
        this.scanner = scanner;
    }
    public static String getUserInfo() {
        System.out.println("Введите имя: ");
        return scanner.NextLine();
    }
}
