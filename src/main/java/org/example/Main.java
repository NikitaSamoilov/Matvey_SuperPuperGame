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
            int successNumb = (int)(Math.random() * 10);
            //int successNumb = random.nextInt(10);
            System.out.println(String.format("Загаданное число: " + successNumb));
            if (!sc.hasNextInt()) {
                if ("exit".equals(sc.nextLine())) {
                    isSuccess = true;

                } else {
                    System.out.println("Введите целое число");
                }
            } else {
                numb = Integer.parseInt(sc.nextLine());

                System.out.println(String.format("Загаданное число: " + successNumb));
                System.out.println(String.format("Твое число: " + numb));

                if (successNumb == numb) {
                    System.out.println("Верно! Ты молодец\n");
                    isSuccess = true;
                } else if (successNumb < numb){
                    System.out.println("Загаданное число меньше\n");
                } else {
                    System.out.println("Загаданное число больше\n");
                }

            }
        }
    }
}