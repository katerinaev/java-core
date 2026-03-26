package hw_8.generics.task_8;

import java.util.ArrayList;
import java.util.List;

/*
Ограничение снизу
Задача: Реализуйте метод, который принимает List<T super Integer> и добавляет в него
несколько чисел.
Объявите метод как public static void addNumbers(List<T super Integer> list)
Используйте метод add() для добавления целых чисел
Элементы можно безопасно добавлять, но при чтении потребуется приведение типа
 */
public class AddingNumbers {
    public static void addNumbers(List<? super Integer> list) {
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Object> numberList = new ArrayList<>();
        addNumbers(numberList);
        System.out.println(numberList);
    }
}
