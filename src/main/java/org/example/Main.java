package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String userName = sc.nextLine();
        System.out.println(userName);

        boolean isSuccess = true;
        while (isSuccess) {
            System.out.println("Угадай число от 1 до 10");
            int successNumb = (int)Math.random()*10;
            int numb = sc.nextInt();
            System.out.println("Результат: " + successNumb + " " + numb);
        }
        //начать бесконечный цикл проверок угадает или нет, если угадал завершить игру и похвалить
        //при неугадовании сказать в меньшую или большую сторону не угадал
    }
}