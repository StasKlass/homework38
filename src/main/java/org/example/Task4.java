package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task4 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 12, 31, 23, 59);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formattedDateTime = dateTime.format(formatter);

        System.out.println("Отформатированная дата и время: " + formattedDateTime);
    }
}
