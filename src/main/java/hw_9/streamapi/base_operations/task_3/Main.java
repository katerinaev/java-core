package hw_9.streamapi.base_operations.task_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
3. Преобразование строк в их длины
Задача: Напишите программу, которая принимает список строк и заменяет каждую строку
на её длину, используя Stream API.
Нужно заменить каждую строку на её длину. Сначала получаем поток, затем используем map, чтобы каждую строку преобразовать в число (length()). После этого собираем результат в список чисел.
Методы:
stream()
map(s -> s.length())
collect(Collectors.toList())
 */
public class Main {
    public static void main(String[] args) {
        List<String> oceans = Arrays.asList("Pacific", "Atlantic", "Indian", "Southern", "Arctic");

        List<Integer> wordsLengths = oceans.stream()
                .map(o -> o.length())
                .collect(Collectors.toList());

        System.out.println(wordsLengths);
    }
}
