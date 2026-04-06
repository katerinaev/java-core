package hw_4.ifelse;

import java.util.Scanner;

/*
4. Проверка на чётность
Задача:
Напишите программу, которая проверяет, является ли введённое число чётным или нечётным.
 */
public class EvenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
