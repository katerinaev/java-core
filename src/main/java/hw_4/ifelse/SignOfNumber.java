package hw_4.ifelse;

import java.util.Scanner;

/*
1. Определение знака числа
Задача:
Напишите программу, которая принимает с консоли число и проверяет:
Если число больше 0, выведите "Число положительное".
Если меньше 0 — "Число отрицательное".
Если равно 0 — "Число равно нулю".
*/
public class SignOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
