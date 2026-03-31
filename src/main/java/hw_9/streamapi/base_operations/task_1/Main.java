package hw_9.streamapi.base_operations.task_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
1. Фильтрация строк по длине больше 5
Задача: Напишите программу, которая принимает список строк и удаляет из него все строки
длиной 5 символов и менее, используя Stream API.
Нужно оставить только те строки, длина которых больше 5 символов. Для этого сначала получаем
поток из списка строк, затем применяем фильтрацию по условию length() > 5.
После этого собираем результат в новый список.
Методы:
stream()
filter(s -> s.length() > 5)
collect(Collectors.toList())
 */
public class Main {
    public static void main(String[] args) {
        List<String> planets = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");

        List<String> moreThanFive = planets.stream()
                .filter(p -> p.length() > 5)
                .collect(Collectors.toList());

        System.out.println(moreThanFive);
    }
}
