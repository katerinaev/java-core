package hw_4.fortasks;

import java.util.Scanner;

/*
3. Таблица умножения для числа
Задача:
Создайте программу, которая выводит таблицу умножения для числа, введённого пользователем.
*/
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
