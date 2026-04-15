package hw_4.fortasks;

import java.util.Scanner;

/*
4. Проверка на простое число
Задача:
Напишите программу, которая проверяет, является ли введённое число простым.
Простое число делится только на 1 и на само себя.
 */
public class CheckIsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " - prime number");
        } else {
            System.out.println(n + " - not prime number");
        }
    }
}
