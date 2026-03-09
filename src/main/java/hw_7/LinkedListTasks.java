package hw_7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTasks {
    public static void main(String[] args) {
// Задача 1:
// Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Sunday");
        list1.add("Monday");
        list1.add("Tuesday");
        list1.add("Wednesday");
        list1.add("Thursday");
        System.out.println("All elements of list1: " + list1);

// Задача 2:  Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и
// обработайте их в порядке поступления.
        LinkedList<String> tasks = new LinkedList<>();
        tasks.offer("Task 1");
        tasks.offer("Task 2");
        tasks.offer("Task 3");
        while(!tasks.isEmpty()) {
            System.out.println("Processing task: " + tasks.poll());
        }

// Задача 3:  Создайте LinkedList, содержащий несколько строк. Напишите программу,
// которая печатает первый и последний элементы списка.
        LinkedList<String> strings = new LinkedList<>(Arrays.asList("First", "Second", "Third", "Last"));
        if (!strings.isEmpty()) {
            System.out.println("First element: " + strings.getFirst());
            System.out.println("Lat element: " + strings.getLast());
        }

// Задача 4: Создайте LinkedList из целых чисел. Напишите программу,
// которая вычисляет сумму элементов списка.
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println("Sum of elements: " + sum);

// Задача 5:
// Используйте ListIterator для прохода по LinkedList в обоих направлениях.
        LinkedList<String> list5 = new LinkedList<>(Arrays.asList("One", "Two", "Three"));
        ListIterator<String> iterator = list5.listIterator();
        System.out.print("Move forward: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.print("Move backward: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}
