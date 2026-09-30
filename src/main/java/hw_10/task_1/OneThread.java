package hw_10.task_1;
/*
Creating a Single Thread
Problem: Write a program that creates a separate thread that prints the message
"Hello from thread!" 5 times with a 1-second pause between messages.
*/
public class OneThread {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i =0; i < 5; i++) {
                System.out.println("Hello from thread!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}
