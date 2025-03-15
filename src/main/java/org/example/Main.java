package org.example;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String userName = sc.nextLine();
        System.out.println(userName);


        boolean isSuccess = false;
        int numb = 0;
        while (!isSuccess) {
            System.out.println("Угадай число от 1 до 10");
            Random random = new Random();
            int successNumb = random.nextInt(10);

            System.out.println(String.format("Загаданное число: " + successNumb));

            //int successNumb = (int) Math.random() * 10;
            if (!sc.hasNextInt()) {
                if ("exit".equals(sc.nextLine())) {
                    isSuccess = true;

                } else {
                    System.out.println("Введите целое число");
                }
            } else {
                numb = sc.nextInt();

//            try {
//                numb = Integer.parseInt(sc.next()); }
//            catch (NumberFormatException e) {
//                System.out.println("Неверный ввод");
//            }

                System.out.println(String.format("Загаданное число: " + successNumb));
                System.out.println(String.format("Твое число: " + numb));

                if (successNumb == numb) {
                    System.out.println("Верно! Ты молодец\n");
                    isSuccess = true;
                } else {
                    System.out.println("Попробуй ещё раз\n");
                }
            }
        }
    }
    //начать бесконечный цикл проверок угадает или нет, если угадал завершить игру и похвалить
    //при неугадовании сказать в меньшую или большую сторону не угадал
}