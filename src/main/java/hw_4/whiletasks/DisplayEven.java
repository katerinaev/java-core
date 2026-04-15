package hw_4.whiletasks;

import java.util.Scanner;

/*
2. Вывод всех чётных чисел до заданного
Задача:
Реализуйте программу, которая выводит все чётные числа от 1 до числа,
введённого пользователем.
 */
public class DisplayEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int i = 1;

        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
