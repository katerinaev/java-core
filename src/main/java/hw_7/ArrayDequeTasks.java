package hw_7;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Задача 1:
Создайте ArrayDeque, добавьте 5 элементов и выведите их.

Задача 2:
Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.

Задача 3:
Используйте ArrayDeque как очередь: добавьте элементы в начало и конец,
извлеките из обоих концов.
 */
public class ArrayDequeTasks {
    public static void main(String[] args) {
        ArrayDeque<String> year = new ArrayDeque<>();
        year.add("March");
        year.addFirst("February");
        year.addLast("April");
        year.offerFirst("January");
        year.offerLast("May");
        System.out.println(year);

        // Task 2
        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.push(100);
        numbers.push(200);
        numbers.push(300);
        System.out.println(numbers);

        while (!numbers.isEmpty()) {
            System.out.println(numbers.pop());
        }

        // Task 3
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.addFirst(5);
        queue.addLast(15);
        System.out.println(queue);
        System.out.println("Remove first: " + queue.removeFirst());
        System.out.println("Remove last: " + queue.removeLast());
        System.out.println(queue);
    }

}
