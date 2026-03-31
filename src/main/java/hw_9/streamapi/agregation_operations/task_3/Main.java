package hw_9.streamapi.agregation_operations.task_3;

import java.util.Arrays;
import java.util.List;

/*
3. Сумма всех элементов списка
Задача: Напишите программу, которая принимает список чисел и вычисляет их сумму,
используя Stream API.
Чтобы посчитать сумму всех чисел в списке, сначала превращаем его в поток.
Затем преобразуем его в числовой поток (целые числа). После этого используем метод sum,
который возвращает сумму всех элементов.
Методы:
stream()
mapToInt(n -> n)
sum()
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println(sum);
    }
}
