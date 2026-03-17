package hw_8.generics.task_6;

import java.util.List;

/*
Работа с числами
Задача: Создайте класс NumberBox<T extends Number>, который хранит только числа и
возвращает их сумму.
Объявите класс NumberBox<T extends Number>
Внутри храните список чисел List<T>
В методе getSum() пройдитесь по списку и суммируйте значения, используя doubleValue()
Метод возвращает сумму в виде double
 */
public class NumberBox<T extends Number>  {
    private List<T> list;
    public static <T extends Number> double getSum(List<T> list) {
        double sum = 0;
        if (!list.isEmpty()) {
            for (T elem : list) {
                sum += elem.doubleValue();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        System.out.println("Sum of integer: " +getSum(intList));

        List<Double> doubleList = List.of(3.15, 5.20, 10.12);
        System.out.println("Sum of double: " +getSum(doubleList));
    }
}
