package hw_9.streamapi.agregation_operations.task_1;

import java.util.Arrays;
import java.util.List;

/*
1. Поиск максимального элемента
Задача: Напишите программу, которая принимает список чисел и находит в нём
самое большое число, используя Stream API.
Нужно найти самое большое число в списке. Сначала превращаем список в поток.
Затем используем метод max, который сравнивает элементы. Он возвращает Optional,
так как список может быть пустым. Чтобы получить само число, нужно вызвать get() или orElse().
Методы:
stream()
max(Comparator.naturalOrder())
get() или orElse(...)
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(500, 200, 155, -155);

        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("List is empty"));

        System.out.println(max);
    }
}
