package hw_7;

import java.util.LinkedHashSet;

public class LinkedHashSetTasks {
    public static void main(String[] args) {
// Задача 1:
//Создайте LinkedHashSet и добавьте в него 5 строк.
// Проверьте порядок элементов при выводе.
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("Firth");
        strings.add("Second");
        strings.add("Third");
        strings.add("Forth");
        strings.add("Fifth");

        System.out.println(strings);

        addNew(strings, "Fifth");
        addNew(strings, "Second");
        addNew(strings, "Fifth");

        System.out.println(strings);

//Задача 2:
//Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.
    }
    public static void addNew(LinkedHashSet<String> set, String newStr) {
        if (!set.contains(newStr)) {
            set.add(newStr);
        }
    }
}
