package hw_4.breakcontinuetasks;

import java.util.Scanner;

/*
3. Вывод только положительных чисел (использовать continue)
Задача:
Напишите программу, которая принимает ряд чисел от пользователя и выводит только положительные.
Отрицательные числа нужно пропускать.
 */
public class OnlyPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter number (0 is break): ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0) {
                continue;
            }
            System.out.println("Entered positive number: " + n);
        }

        System.out.println("Program is over");
    }
}
