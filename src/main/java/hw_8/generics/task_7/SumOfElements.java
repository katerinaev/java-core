package hw_8.generics.task_7;

import java.util.List;

/*
Ограничение сверху
Задача: Напишите обобщённый метод, который принимает List<T extends Number> и
вычисляет сумму элементов.
Метод должен выглядеть как public static void sum(List<T extends Number> list)
Используйте цикл for-each, чтобы получить доступ к элементам
Для каждого элемента вызывайте doubleValue() и прибавляйте к переменной суммы
Помните, что добавлять элементы в такой список нельзя
 */
public class SumOfElements {
    public static <T extends Number> void sum(List<T> list) {
        if(!list.isEmpty()) {
            double sum = 0;
            for (T num : list) {
                sum += num.doubleValue();
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(-1, -2, -3, -4, -5);
        List<Double> doubleList = List.of(5.55, -10.05, -20.45);

        sum(intList);
        sum(doubleList);
    }
}
