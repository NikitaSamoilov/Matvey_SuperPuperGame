package org.example.model;

public class User {

    /*
    Поля класса
     */
    private String name;
    private String surname;
    private int age;
    private int grow;

    /*
    Конструкторы
     */

    public User() {

    }

    public User(String name, String surname, int age, int grow) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.grow = grow;
    }


    /*
    Методы доступа к полям класса
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrow() {
        return grow;
    }

    public void setGrow(int grow) {
        this.grow = grow;
    }
}
