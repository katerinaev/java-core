package hw_10.task_2;
/*
Task: Create two threads.
One thread should print "A," the other "B," each 5 times with a slight delay.
*/
public class TwoThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread A was interrupted");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread B was interrupted");
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
