package hw_7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTasks {
    public static void main(String[] args) {
        // Задача 1:
        //Создайте HashSet из 5 чисел и выведите его содержимое.
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(25);
        System.out.println(set);

        //Задача 2:
        //Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
        int number = 100;
        set.add(30);
        set.add(35);
        set.add(40);
        set.add(45);
        set.add(100);
        if (set.contains(number)) {
            System.out.println(number + " is contained in set");
        } else {
            System.out.println("Set doesn't contain " + number);
        }

        System.out.println(removeDuplicates(Arrays.asList("One", "Two", "One")));

        //Задача 4:
        //Создайте HashSet, содержащий набор имен. Напишите программу, которая проверяет,
        // содержится ли ваше имя в множестве, и выводит соответствующее сообщение.
        HashSet<String> names = new HashSet<>();
        names.add("Artem");
        names.add("Ivan");
        names.add("Petr");
        names.add("Paul");
        String myName = "Paul";
        if (names.contains(myName)) {
            System.out.println(myName + " is present in set");
        } else {
            System.out.println(myName + " is absent");
        }
    }
    // Задача 3:
    // Реализуйте метод, который принимает List<String> и возвращает Set<String>
    // без дубликатов.
    public static Set<String> removeDuplicates(List<String> list) {
        return new HashSet<>(list);
    }
}
