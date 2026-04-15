package hw_4.dowhiletasks;

import java.util.Scanner;

/*
5. Подсчёт количества цифр в числе
Задача:
Напишите программу, которая подсчитывает, сколько цифр в целом числе, введённом пользователем.
 */
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int count = 0;

        do {
            count++;
            number /= 10;
        } while (number != 0);

        System.out.println("Number of digits: " + count);
    }
}
