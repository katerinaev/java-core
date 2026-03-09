package hw_7;

import java.util.PriorityQueue;

/*
Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
 */
public class PriorityQueueTask {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(8);
        priorityQueue.offer(7);
        priorityQueue.offer(15);
        priorityQueue.add(5);
        priorityQueue.add(1);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
