package hw_4.dowhiletasks;

import java.util.Scanner;

/*
4. Завершение программы по команде "exit"
Задача:
Напишите программу, которая будет ждать ввода команды "exit" от пользователя
для завершения работы.
*/
public class ProgramTermination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.print("Enter command to finish program: ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));

        System.out.println("Program is terminated");
    }
}
