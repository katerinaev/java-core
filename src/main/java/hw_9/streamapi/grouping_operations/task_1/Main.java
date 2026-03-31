package hw_9.streamapi.grouping_operations.task_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
1. Группировка строк по первой букве
Задача: Напишите программу, которая принимает список строк и группирует их по первой букве,
используя Stream API.
Нужно сгруппировать слова по первой букве. Сначала превращаем список строк в поток. Затем используем метод collect, который собирает элементы в коллекцию. С помощью Collectors.groupingBy(...) мы можем указать ключ для группировки — в данном случае, первую букву каждого слова. Это может быть word.charAt(0) или word.substring(0, 1).
Методы:
stream()
collect(...)
Collectors.groupingBy(...)
s -> s.charAt(0) или s -> s.substring(0, 1)
*/
public class Main {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("One", "Two", "Three", "Four", "Five");

        Map<Character, List<String>> groupedNumbers = numbers.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0)));

        System.out.println(groupedNumbers);
    }
}
