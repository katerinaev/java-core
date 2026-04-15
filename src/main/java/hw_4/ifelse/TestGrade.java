package hw_4.ifelse;

import java.util.Scanner;

/*
6. Оценка результата теста по баллам
Задача:
Программа принимает число — результат теста (0–100) и выводит:
90 и выше — "Отлично"
75–89 — "Хорошо"
60–74 — "Удовлетворительно"
ниже 60 — "Неудовлетворительно"
 */
public class TestGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter test result (0-100): ");

        int result = scanner.nextInt();

        if (result < 0 || result > 100) {
            System.out.println("Test result must be between 0 and 100");
            return;
        }

        if (result >= 90) {
            System.out.println("Excellent");
        } else if (result >= 75) {
            System.out.println("Good");
        } else if (result >= 60) {
            System.out.println("Satisfactory");
        } else {
            System.out.println("Unsatisfactory");
        }
    }
}
