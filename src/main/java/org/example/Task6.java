package org.example;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class Task6 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        int birthMonth = 10;
        int birthDay = 06;

        int currentYear = today.getYear();

        LocalDate birthdayThisYear = LocalDate.of(currentYear, birthMonth, birthDay);

        LocalDate nextBirthday;
        if (today.isAfter(birthdayThisYear) || today.isEqual(birthdayThisYear)) {
            nextBirthday = LocalDate.of(currentYear + 1, birthMonth, birthDay);
        } else {
            nextBirthday = birthdayThisYear;
        }

        DayOfWeek dayOfWeek = nextBirthday.getDayOfWeek();

        System.out.println("День недели для следующего дня рождения: " + dayOfWeek);
    }
}
