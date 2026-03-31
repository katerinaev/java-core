package hw_9.streamapi.agregation_operations.task_4;

import java.util.Arrays;
import java.util.List;

/*
4. Поиск первого элемента, начинающегося на "Б"
Задача: Напишите программу, которая принимает список строк и находит первую строку,
начинающуюся на букву "Б", используя Stream API.
Нужно найти первую строку, начинающуюся с определённой буквы. Для этого создаём поток,
фильтруем элементы по условию (startsWith("Б")), а затем берём первый подходящий
с помощью findFirst(). Результат будет в Optional.
Методы:
stream()
filter(s -> s.startsWith("Б"))
findFirst()
 */
public class Main {
    public static void main(String[] args) {
        List<String> pets = Arrays.asList("Боря", "Барсик", "Марси");

        if (pets.isEmpty()) {
            System.out.println("List is empty!");
        } else {
            String petName = pets.stream()
                    .filter(p -> p.startsWith("Б"))
                    .findFirst()
                    .orElse("No string with 'Б'");

            System.out.println(petName);
        }
    }
}
