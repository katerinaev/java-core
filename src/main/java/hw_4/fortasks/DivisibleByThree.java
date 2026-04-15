package hw_4.fortasks;
/*
1. Вывод чисел от 1 до 100, делящихся на 3
Задача:
Напишите программу, которая выводит все числа от 1 до 100, которые делятся на 3.
 */
public class DivisibleByThree {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
