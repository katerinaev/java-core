package hw_10.task_4;
/*
Task: Using synchronized
Task: Write a Counter class with an increment method that increments the counter value.
Create two threads, each calling increment() 1000 times. Ensure proper operation
using synchronized.
*/
public class Counter {
    private int count = 0;
    public synchronized void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}
