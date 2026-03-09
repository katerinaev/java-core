package hw_7;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Задача 1:
Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.

Задача 2:
Напишите программу, которая выводит все чётные числа из ArrayList.

Задача 3:
Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.

Задача 4:
Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и
выводит сумму всех чисел в списке.

Задача 5:
Создайте ArrayList из целых чисел. Напишите программу, которая находит и
выводит максимальное число из списка.
 */
public class ArrayListTasks {
    public static void main(String[] args) {
        printArrayList(new ArrayList<>(Arrays.asList(1, 3, 6, 9, 10)));
        printEvenNumbers(new ArrayList<>(Arrays.asList(2, 5, 7, 13, 6, 9, 10)));
        printLongestString(new ArrayList<>(Arrays.asList("apple", "pear", "banana")));
        sumOfAllNumbers(new ArrayList<>(Arrays.asList(12, 24, 36, 100)));
        maxOfArrayList(new ArrayList<>(List.of(-18, 20, 100, 500)));

    }

    public static void printArrayList(List<Integer> arrayList) {
        arrayList.add(5);
        System.out.println(arrayList);
    }

    public static void printEvenNumbers(List<Integer> arrayList) {
        if (!arrayList.isEmpty()) {
            for (int num : arrayList) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }

    public static void printLongestString(List<String> strings) {
        int maxLength = 0;
        String longest = "";

        for (String str : strings) {
            if (str.length() > maxLength) {
                maxLength = str.length();
                longest = str;
            }
        }

        System.out.println(longest);
    }

    public static void sumOfAllNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println(sum);
    }

    public static void maxOfArrayList(List<Integer> numbers) {
        if (!numbers.isEmpty()) {
            int max = numbers.get(0);

            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }

            System.out.println(max);
        } else {
            System.out.println("Array cannot be empty");
        }
    }
}
