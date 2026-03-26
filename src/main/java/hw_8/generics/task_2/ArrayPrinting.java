package hw_8.generics.task_2;
/*
 2. Задача на дженерик метод
 Условие задачи: Напишите дженерик метод printArray, который принимает массив элементов
 любого типа и выводит каждый элемент массива на консоль.
*/
public class ArrayPrinting {
    public static <T> void printArray(T[] array) {
        for (T elem : array) {
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {20, 15, 10, 9, 1};
        String[] strArray = {"Apple", "Banana", "Orange"};
        printArray(intArray);
        System.out.println();
        printArray(strArray);
    }
}
