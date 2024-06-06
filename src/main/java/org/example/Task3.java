package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Task3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        int birthMonth = 10;
        int birthDay = 06;

        int currentYear = today.getYear();

        LocalDate birthdayThisYear = LocalDate.of(currentYear, birthMonth, birthDay);

        LocalDate lastBirthday;
        if (today.isBefore(birthdayThisYear) || today.isEqual(birthdayThisYear)) {
            lastBirthday = LocalDate.of(currentYear - 1, birthMonth, birthDay);
        } else {
            lastBirthday = birthdayThisYear;
        }

        Period period = Period.between(lastBirthday, today);

        System.out.println("Разница между сегодняшней датой и последним днем рождения:");
        System.out.println("Лет: " + period.getYears());
        System.out.println("Месяцев: " + period.getMonths());
        System.out.println("Дней: " + period.getDays());
    }
}

