package hw_8.generics.task_1;
/*
1. Задача на дженерик класс
Условие задачи: Разработайте дженерик класс Box, который может хранить объекты любого типа.
Класс должен иметь методы для установки и получения значения объекта, хранящегося внутри.
 */
public class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(66);
        System.out.println(intBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println(stringBox.get());
    }
}
