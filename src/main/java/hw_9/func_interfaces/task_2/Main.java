package hw_9.func_interfaces.task_2;
/*
Задача: Создайте анонимный класс, реализующий интерфейс Runnable, который выводит сообщение
"Hello from anonymous class!".
Используйте конструкцию Runnable r = new Runnable() { ... }
Внутри метода run() выведите сообщение
Вызовите r.run() (не start(), так как это не Thread, а просто Runnable)
 */
public class Main {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r.run();
    }
}
