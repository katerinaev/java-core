package hw_4.ifelse;

import java.util.Scanner;

/*
2. Поиск наибольшего из двух чисел
Задача:
Создайте программу, которая принимает два числа и выводит наибольшее из них.
*/
public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = scanner.nextInt();

        System.out.println("Enter second number");
        int second = scanner.nextInt();

        int max = first;

        if (second > max) {
            max = second;
        }

        System.out.println("Max of two numbers: " + max);
    }
}
