package hw_8.exceptions.task_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
1. Обработка проверяемого исключения
Условие задачи:
Напишите программу, которая пытается открыть файл с именем "data.txt". Если файл не найден,
программа должна обработать исключение и вывести сообщение: "Файл не найден".
Используй класс FileReader из пакета java.io.
Метод new FileReader("data.txt") может выбросить проверяемое исключение FileNotFoundException.
Оберни этот вызов в блок try-catch.
В catch выведи сообщение о том, что файл не найден.
 */
public class ReadingFile {
    public static void readFile(String filename) {
        FileReader reader = null;
        try {
            reader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }

    public static void main(String[] args) {
        readFile("data.txt");
    }
}
