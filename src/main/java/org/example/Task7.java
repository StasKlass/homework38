package org.example;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Task7 {
    public static void main(String[] args) {
        ZonedDateTime localDateTime = ZonedDateTime.now();

        ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoDateTime = localDateTime.withZoneSameInstant(tokyoZoneId);

        System.out.println("Локальное время: " + localDateTime);
        System.out.println("Время в Токио: " + tokyoDateTime);
    }
}
