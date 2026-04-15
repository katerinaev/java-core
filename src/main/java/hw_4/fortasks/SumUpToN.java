package hw_4.fortasks;

import java.util.Scanner;

/*
2. Сумма чисел от 1 до n
Задача:
Реализуйте программу, которая принимает с консоли число n и вычисляет
сумму всех чисел от 1 до n.
*/
public class SumUpToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers from 1 to N: " + sum);
    }
}
