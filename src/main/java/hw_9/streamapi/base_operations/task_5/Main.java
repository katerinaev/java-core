package hw_9.streamapi.base_operations.task_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
5. Удаление дубликатов из списка
Задача: Напишите программу, которая принимает список элементов и удаляет из него
все дубликаты, используя Stream API.
 */
public class Main {
    public static void main(String[] args) {
        List<String> listWithDuplicates = Arrays.asList("Berry", "Banana", "Apple", "Berry", "Pear", "Banana", "Banana");

        List<String> withoutDuplicates = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(withoutDuplicates);
    }
}
