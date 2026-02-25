package hw_7;

import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {
    public static void main(String[] args) {
        // Задача 1: Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и
        // выведите все записи.
        HashMap<String, Integer> friends = new HashMap<>();
        friends.put("Ross", 26);
        friends.put("Monica", 25);
        friends.put("Rachel", 24);
        friends.put("Chandler", 26);
        friends.put("Joey", 25);
        for (Map.Entry<String, Integer> entry : friends.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
        // Задача 2: Проверьте, есть ли определённое имя в HashMap.

        String name = "John";
        if (friends.containsKey(name)) {
            System.out.println(name + " is " + friends.get(name));
        } else {
            System.out.println("There's no " + name + " in HashMap");
        }
        System.out.println();
        // Задача 3: Реализуйте метод, который печатает из HashMap всех пользователей
        // младше 18 лет.
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Artem", 11);
        people.put("Ivan", 15);
        people.put("Julia", 18);
        people.put("Victor", 35);
        people.put("Kate", 28);

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            if (entry.getValue() < 18) {
                System.out.println(entry.getKey() + " is not 18 yet.");
            }
        }
    }
}
