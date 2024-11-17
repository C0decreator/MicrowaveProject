package com.example.model;  // Укажите правильный пакет

public class Holiday {
    private String name;
    private String date;

    // Конструкторы
    public Holiday() {}

    public Holiday(String name, String date) {
        this.name = name;
        this.date = date;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}