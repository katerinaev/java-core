package hw_9.func_interfaces.task_5;

import java.util.function.Consumer;

/*
5. Использование Consumer
Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.
Используйте интерфейс Consumer<String>
Лямбда: s -> System.out.println(s)
Вызовите метод accept("Привет")
 */
public class Main {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        print.accept("Hello World!");
    }
}
