package hw_9.streamapi.grouping_operations.task_2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
2. Группировка чисел по чётности
Задача: Напишите программу, которая принимает список чисел и группирует их на
чётные и нечётные, используя Stream API.
Нужно разделить числа на две группы: чётные и нечётные. Сначала получаем поток из списка. Затем используем collect с Collectors.groupingBy(...), передавая в качестве ключа булевое выражение n % 2 == 0. В результате получится отображение: true — список чётных чисел, false — нечётных.
Методы:
stream()
collect(...)
Collectors.groupingBy(...)
n -> n % 2 == 0
*/
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 10, 15, 20);

        Map<Boolean, List<Integer>> parityGrouping = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println(parityGrouping);
    }
}
