package hw_7;

import java.util.TreeSet;

/*
Задача 1:
Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.

Задача 2:
Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.

Задача 3:
Найдите ближайшее большее и меньшее число к заданному в TreeSet.
 */
public class TreeSetTasks {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(50);
        treeSet.add(30);
        System.out.println(treeSet);

        int number = -100;
        if (!treeSet.isEmpty()) {
            System.out.println("More than " + number + ": " + treeSet.higher(number));
            System.out.println("Less than " + number + ": " + treeSet.lower(number));
        }
    }
}
