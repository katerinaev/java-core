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
    public NumberBox(List<T> list) {
        this.list = list;
    }
    public double getSum() {
        double sum = 0;
        if (!list.isEmpty()) {
            for (T elem : list) {
                sum += elem.doubleValue();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>(List.of(1, 2, 3, 4, 5));
        System.out.println("Sum of integer: " + intBox.getSum());

        NumberBox<Double> doubeBox = new NumberBox<>(List.of(3.15, 5.20, 10.12));
        System.out.println("Sum of double: " + doubeBox.getSum());
    }
}
