package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String userName = sc.nextLine();
        System.out.println(userName);

        //TODO Булевы операции, разобрать
        boolean isSuccess = false;
        while (!isSuccess) {
            System.out.println("Угадай число от 1 до 10");
            int successNumb = (int) Math.random() * 10; //TODO надо понять, как получить ЦЕЛОЕ случое число из диапазона
            int numb = sc.nextInt(); //TODO - проверка на корректность ввода
            System.out.println(String.format("Результат: %s %s", successNumb, numb));
        }
        //начать бесконечный цикл проверок угадает или нет, если угадал завершить игру и похвалить
        //при неугадовании сказать в меньшую или большую сторону не угадал
    }
}