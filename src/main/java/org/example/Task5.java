package org.example;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task5 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        int nextYear = now.getYear() + 1;
        LocalDateTime nextNewYear = LocalDateTime.of(nextYear, 1, 1, 0, 0);

        long days = ChronoUnit.DAYS.between(now, nextNewYear);
        long hours = ChronoUnit.HOURS.between(now, nextNewYear) % 24;
        long minutes = ChronoUnit.MINUTES.between(now, nextNewYear) % 60;

        System.out.println("До следующего Нового Года осталось:");
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
    }
}
