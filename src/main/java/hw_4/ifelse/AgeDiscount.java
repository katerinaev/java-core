package hw_4.ifelse;

import java.util.Scanner;

/*
5. Определение размера скидки по возрасту
Задача:
Напишите программу, которая определяет размер скидки:
До 18 лет — 25%
От 65 и старше — 30%
Остальные — без скидки
 */
public class AgeDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");

        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Discount: 25%");
        } else if (age >= 65) {
            System.out.println("Discount: 30%");
        } else {
            System.out.println("No discount");
        }
    }
}
