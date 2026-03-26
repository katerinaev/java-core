package hw_8.generics.task_9;
/*
Обобщённый интерфейс
Задача: Создайте интерфейс Container<T>, содержащий методы add(T item) и get().
Объявите интерфейс как interface Container<T>
Объявите два метода:
void add(T item)
T get()
Создайте класс, реализующий этот интерфейс, и реализуйте в нём хранение одного элемента
 */
public class Box<T> implements Container<T> {
    private T item;

    public void add(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.add(1000);
        System.out.println(intBox.get());

        Box<String> strBox = new Box<>();
        strBox.add("Ocean");
        System.out.println(strBox.get());
    }
}
