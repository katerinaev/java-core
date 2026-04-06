package hw_4.whiletasks;

import java.util.Scanner;

/*
3. Обратный отсчёт от введённого числа до 1
Задача:
Создайте программу, которая принимает с консоли положительное число и выводит
обратный отсчёт от него до 1.
*/
public class CountDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}
