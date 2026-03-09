package hw_7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
Задача 1:
Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.

Задача 2:
Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.

Задача 3:
Создайте LinkedHashMap, который хранит историю просмотров пользователя
(максимум 10 элементов).
 */
public class LinkedHashMapTasks {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> letters = new LinkedHashMap<>();
        letters.put("C", 3);
        letters.put("D", 4);
        letters.put("B", 2);
        letters.put("E", 5);
        letters.put("A", 1);

        for (Map.Entry<String, Integer> letter : letters.entrySet()) {
            System.out.println(letter.getKey() + " -> " + letter.getValue());
        }

// Task 2
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Artem", "11-22-333");
        phoneBook.put("Alice", "99-88-777");
        phoneBook.put("Tom", "55-66-888");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();

        if (phoneBook.containsKey(name)) {
            System.out.println(name + "'s phone number is: " + phoneBook.get(name));
        } else {
            System.out.println("Contact " + name + " not found");
        }

        // Task 3
        LinkedHashMap<String, String> history = new LinkedHashMap<>();
        for (int i = 1; i <= 20; i++) {
            if (history.size() == 10) {
                history.pollFirstEntry();
            }
            history.put("#_" + i, "Page " + i);
        }

        for (Map.Entry<String, String> page : history.entrySet()) {
            System.out.println(page.getKey() + " -> " + page.getValue());
        }
    }
}
