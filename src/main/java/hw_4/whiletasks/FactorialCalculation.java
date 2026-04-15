package hw_4.whiletasks;

import java.util.Scanner;

/*
1. Вычисление факториала с помощью while
Задача:
Напишите программу, которая принимает с консоли число и выводит его факториал
(произведение всех чисел от 1 до n), используя цикл while.
 */
public class FactorialCalculation {
    public static void main(String[] args) {
        int factorial = 1;
        int i = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for factorial calculation: ");
        int number = scanner.nextInt();

        while (i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial " + number + ": " + factorial);
    }
}
