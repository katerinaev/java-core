package hw_4.switchtasks;

import java.util.Scanner;

/*
3. Перевод числовых оценок в буквенные (A–F)
Задача:
Программа принимает число от 0 до 100 и переводит его в буквенную оценку по шкале:
90–100 — A
80–89 — B
70–79 — C
60–69 — D
ниже 60 — F
*/
public class GradeConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grade 0 - 100: ");
        int grade = scanner.nextInt();
        String letterGrade = "";

        if (grade >= 90) {
            letterGrade = "A";
        } else if (grade >= 80) {
            letterGrade = "B";
        } else if (grade >= 70) {
            letterGrade = "C";
        } else if (grade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        System.out.println("Letter grade: " + letterGrade);
    }
}
