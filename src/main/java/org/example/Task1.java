package org.example;

import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        int birthMonth = 10;
        int birthDay = 06;

        int currentYear = today.getYear();

        LocalDate birthdayThisYear = LocalDate.of(currentYear, birthMonth, birthDay);

        LocalDate nextBirthday;
        if (today.isAfter(birthdayThisYear)) {
            nextBirthday = LocalDate.of(currentYear + 1, birthMonth, birthDay);
        } else {
            nextBirthday = birthdayThisYear;
        }

        System.out.println("Сегодняшняя дата: " + today);
        System.out.println("Дата следующего дня рождения: " + nextBirthday);
    }
}
