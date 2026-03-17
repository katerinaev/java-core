package hw_8.generics.task_10;

import java.util.HashMap;
import java.util.Map;

/*
Коллекция с обобщёнными типами
Задача: Создайте Map<K, V> и реализуйте метод, который принимает обобщённые ключи и значения,
а затем выводит их.
Объявите метод как public static <K, V> void printMap(Map<K, V> map)
Используйте цикл for (Map.Entry<K, V> entry : map.entrySet())
Выводите каждый ключ и значение с помощью System.out.println()
В main() протестируйте с разными типами данных, например, Map<String, Integer>
 */
public class MapPrint {
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> spring = new HashMap<>();
        spring.put(1, "March");
        spring.put(2, "April");
        spring.put(3, "May");

        printMap(spring);

    }
}
