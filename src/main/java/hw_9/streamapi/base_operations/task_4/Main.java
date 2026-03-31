package hw_9.streamapi.base_operations.task_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
4. Создание списка квадратов чисел
Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список,
где каждое число заменено на его квадрат, используя Stream API.

 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squares);
    }
}
