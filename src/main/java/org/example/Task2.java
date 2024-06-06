package org.example;

import java.time.LocalTime;

public class Task2 {
    public static void main(String[] args) {
        LocalTime timeMorning = LocalTime.of(7, 30);
        LocalTime timeEvening = LocalTime.of(20, 45);

        if (timeMorning.isBefore(timeEvening)) {
            System.out.println(timeMorning + " раньше чем " + timeEvening);
        } else if (timeMorning.isAfter(timeEvening)) {
            System.out.println(timeMorning + " позже чем " + timeEvening);
        } else {
            System.out.println(timeMorning + " равно " + timeEvening);
        }
    }
}
