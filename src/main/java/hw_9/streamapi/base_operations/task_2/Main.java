package hw_9.streamapi.base_operations.task_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
2. Фильтрация чисел, кратных 5
Задача: Напишите программу, которая принимает список чисел и отбирает только те,
которые делятся на 5 без остатка, используя Stream API.
Нужно отобрать только числа, которые делятся на 5. Начинаем с преобразования списка в поток, затем фильтруем с помощью условия n % 5 == 0 и сохраняем результат в новый список.
Методы:
stream()
filter(n -> n % 5 == 0)
collect(Collectors.toList())
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 42, 33, 15, 100, 11);

        List<Integer> multiplyFive = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(multiplyFive);
    }
}
