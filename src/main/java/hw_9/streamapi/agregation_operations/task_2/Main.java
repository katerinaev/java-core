package hw_9.streamapi.agregation_operations.task_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
2. Поиск минимального элемента
Задача: Напишите программу, которая принимает список чисел и находит в нем наименьшее число,
используя Stream API.
Нужно найти наименьшее значение в списке чисел. После создания потока применяем метод min,
который возвращает Optional. Если список не пуст, можно получить значение через
get() или orElse(...).
Методы:
stream()
min(Comparator.naturalOrder())
get() или orElse(...)
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100, 33, 48, -155, 500);

        int min = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow();

        System.out.println(min);
    }
}
