package hw_9.streamapi.agregation_operations.task_5;

import java.util.Arrays;
import java.util.List;

/*
5. Проверка наличия хотя бы одного элемента по условию
Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке,
который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.
Нужно проверить, есть ли хотя бы один элемент, удовлетворяющий условию (например,
чётное число). После создания потока используем метод anyMatch, который вернёт true,
если хотя бы один элемент проходит проверку.
Методы:
stream()
anyMatch(n -> условие)
*/
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 55, 8, 11, 10);

        boolean isAnyEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(isAnyEven);
    }
}
