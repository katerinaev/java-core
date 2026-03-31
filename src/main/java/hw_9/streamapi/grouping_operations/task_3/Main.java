package hw_9.streamapi.grouping_operations.task_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
3. Поиск среднего значения чисел
Задача: Напишите программу, которая принимает список чисел и находит их среднее значение,
используя Stream API.
Чтобы найти среднее значение, преобразуем список в поток. Затем применяем метод collect с Collectors.averagingInt(...). Внутри указываем функцию, возвращающую значение элемента. Если список содержит Integer, то достаточно использовать n -> n.
Методы:
stream()
collect(...)
Collectors.averagingInt(n -> n)
*/
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 29, 33, 40, 50, 60, 70, 80, 96);

        double average = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));

        System.out.println(average);
    }
}
