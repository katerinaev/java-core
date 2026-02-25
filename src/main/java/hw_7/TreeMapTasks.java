package hw_7;

import java.util.Map;
import java.util.TreeMap;

/*
Задача 1:
Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы).
Выведите отсортированные данные.

Задача 2:
Найдите минимальный и максимальный ключ в TreeMap.

Задача 3:
Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска
ближайшего большего ID.
 */
public class TreeMapTasks {
    public static void main(String[] args) {
        TreeMap<String, Integer> scores = new TreeMap<>();
        scores.put("Zahar", 7);
        scores.put("Polina", 6);
        scores.put("Denis", 8);
        scores.put("Dasha", 9);
        scores.put("Artem", 10);

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " scores " + entry.getValue());
        }
        System.out.println();

        // Task 2
        System.out.println("Max key is: " + scores.firstKey());
        System.out.println("Min key is: " + scores.lastKey());
        System.out.println();

        // Task 3
        TreeMap<Integer, String> employees = new TreeMap<>();
        employees.put(100, "Ivanov");
        employees.put(200, "Petrov");
        employees.put(300, "Sidorov");
        employees.put(500, "Doe");
        employees.put(400, "Aleksandrov");

        int id = 499;

        System.out.println("The nearest larger ID to " + id + ": " + employees.higherKey(id));
    }
}
