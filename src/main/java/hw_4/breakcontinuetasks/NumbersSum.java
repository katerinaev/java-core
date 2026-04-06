package hw_4.breakcontinuetasks;

import java.util.Scanner;

/*
1. Сумма чисел до первого отрицательного (использовать break)
Задача:
Напишите программу, которая запрашивает у пользователя числа и выводит их сумму.
Программа завершает выполнение, если пользователь вводит отрицательное число.
 */
public class NumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int sum = 0;

        while(true) {
            System.out.println("Enter number (negative is break): ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            sum += number;
        }

        System.out.println("Sum: " + sum);
    }
}
