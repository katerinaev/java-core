package hw_4.breakcontinuetasks;
/*
2. Пропуск чисел, делящихся на 3 (использовать continue)
Задача:
Создайте программу, которая выводит числа от 1 до 20, пропуская те, которые делятся на 3.
 */
public class ExceptDivisibleByThree {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
