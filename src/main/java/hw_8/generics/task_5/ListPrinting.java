package hw_8.generics.task_5;

import java.util.List;

/*
Обобщённый метод
Задача: Реализуйте метод printList(List<T>), который принимает список любого типа и
выводит его элементы.
Объявите метод как public static <T> void printList(List<T> list)
Используйте цикл for-each, чтобы пройтись по элементам списка
Выведите каждый элемент через System.out.println()
 */
public class ListPrinting {
    public static <T> void printList(List<T> list) {
        for (T elem : list) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(100, 90, 10, 25, 0);
        printList(intList);

        List<String> strList = List.of("Sunday", "Monday", "Tuesday", "Wednesday");
        printList(strList);
    }
}
