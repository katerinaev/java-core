package hw_4.switchtasks;

import java.util.Scanner;

/*
1. Вывод дня недели по номеру
Задача:
Реализуйте программу, которая принимает с консоли число от 1 до 7 и выводит название
соответствующего дня недели (например, 1 — "Понедельник").
 */
public class WeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1 - 7: ");
        int day = scanner.nextInt();
        String stringDay = "";

        switch (day) {
            case 1 -> stringDay = "Monday";
            case 2 -> stringDay = "Tuesday";
            case 3 -> stringDay = "Wednesday";
            case 4 -> stringDay = "Thursday";
            case 5 -> stringDay = "Friday";
            case 6 -> stringDay = "Saturday";
            case 7 -> stringDay = "Sunday";
        }

        System.out.println("Day of week: " + stringDay);
    }
}
