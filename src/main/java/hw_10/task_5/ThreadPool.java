package hw_10.task_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
Implementing a Thread Pool for Task Processing
Problem Statement:
Write a program that uses ExecutorService to create
a thread pool in which multiple threads process tasks.
Each task is a simple test execution with a delay.
The program should create a pool of 4 threads, each task executed with a 2-second delay.
After all tasks have completed, the result should be displayed on the main thread.
*/
public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (int i = 1; i <= 12; i++) {
            final int taskNumber = i;
            executor.execute(() -> {
                System.out.println("Test " + taskNumber + " is running in " +
                        Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " was interrupted");
                    Thread.currentThread().interrupt();
                }
            });
        }
        executor.shutdown();
        if (executor.awaitTermination(1, TimeUnit.MINUTES)) {
            System.out.println("Tests passed successfully in " + Thread.currentThread().getName());
        }
    }
}
