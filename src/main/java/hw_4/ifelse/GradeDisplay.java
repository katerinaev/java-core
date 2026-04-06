package hw_4.ifelse;

import java.util.Scanner;

/*
3. Вывод оценки по шкале 1–5
Задача:
Программа принимает число от 1 до 5 и выводит текстовое описание оценки:
5 — "Отлично"
4 — "Хорошо"
3 — "Удовлетворительно"
2 или 1 — "Неудовлетворительно"
*/
public class GradeDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a grade from 1 to 5: ");
        int grade = scanner.nextInt();

        switch (grade) {
            case 5:
                System.out.println("Excellent!");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Satisfactory");
                break;
            case 2: case 1:
                System.out.println("Unsatisfactory");
                break;
            default:
                System.out.println("Enter correct grade 1 - 5");
        }
    }
}
