package hw_9.func_interfaces.task_4;

import java.util.function.Function;

/*
4. Лямбда-выражение с Function
Задача: Создайте лямбду, которая принимает строку и возвращает её длину.
Используйте интерфейс Function<String, Integer>
Лямбда: s -> s.length()
Вызовите метод apply("текст"), чтобы получить длину строки
 */
public class Main {
    public static void main(String[] args) {
        Function<String, Integer> strLength = String::length;

        System.out.println(strLength.apply("Hello"));
    }
}
