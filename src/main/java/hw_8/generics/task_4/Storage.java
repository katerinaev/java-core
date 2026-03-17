package hw_8.generics.task_4;
/*
Обобщённый класс
Задача: Создайте класс Storage<T>, который хранит элемент и возвращает его.
Объявите класс как class Storage<T>
Добавьте поле T item
Реализуйте методы:
void set(T item) — для установки значения
T get() — для получения значения
В main() создайте экземпляры класса с типами String, Integer и проверьте работу методов
 */
public class Storage<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }

    public static void main(String[] args) {
        Storage<Integer> intStorage = new Storage<>();
        intStorage.set(10);

        System.out.println(intStorage.get());

        Storage<String> strStorage = new Storage<>();
        strStorage.set("Java");
        System.out.println(strStorage.get());
    }
}
