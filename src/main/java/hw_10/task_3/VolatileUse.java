package hw_10.task_3;
/*
Task: Using volatile
Task: Create a thread that increments a counter infinitely.
In the main thread, set the stop flag to true after 2 seconds to stop the thread.
*/
public class VolatileUse {
    volatile static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            long count = 0;
            while (!stop) {
                count++;
            }
            System.out.println("Count: " + count);
        };

        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(2000);
        stop = true;
        thread.join();
        System.out.println("The thread was ended");
    }
}
