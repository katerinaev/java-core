package hw_4.dowhiletasks;

import java.util.Scanner;

/*
1. Запрос положительного числа
Задача:
Напишите программу, которая запрашивает у пользователя число и продолжает спрашивать,
пока оно не станет положительным.
 */
public class RequestPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Enter positive number");
            n = scanner.nextInt();
        } while (n <= 0);

        System.out.println("You entered: " + n);
    }
}
