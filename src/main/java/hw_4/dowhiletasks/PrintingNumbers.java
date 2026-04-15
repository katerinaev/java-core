package hw_4.dowhiletasks;
/*
3. Вывод чисел от 1 до 10 с использованием do-while
Задача:
Создайте программу, которая выводит числа от 1 до 10, используя do-while.
 */
public class PrintingNumbers {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
