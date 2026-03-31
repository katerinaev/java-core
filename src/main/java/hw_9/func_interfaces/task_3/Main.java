package hw_9.func_interfaces.task_3;

import java.util.function.Predicate;

/*
3. Лямбда-выражение с Predicate
Задача: Напишите лямбду, которая проверяет, является ли число чётным.
Используйте интерфейс Predicate<Integer>
Лямбда будет выглядеть так: x -> x % 2 == 0
Вызовите test(число) и проверьте результат (true или false)
*/
public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(5));
        System.out.println(isEven.test(10));
    }



}
