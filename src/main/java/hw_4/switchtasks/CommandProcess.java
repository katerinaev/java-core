package hw_4.switchtasks;

import java.util.Scanner;

/*
4. Обработка текстовых команд
Задача:
Программа читает строку: "start", "stop", "restart" или "status". Для каждой команды
нужно вывести соответствующее сообщение, например: "Система запущена".
 */
public class CommandProcess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter command: start, stop, restart or status ");
        String command = scanner.nextLine();

        switch (command) {
            case "start" -> System.out.println("System started");
            case "stop" -> System.out.println("System stopped");
            case "restart" -> System.out.println("System restarted");
            case "status" -> System.out.println("System status");
            default -> System.out.println("Unknown command. Enter: start, stop, restart or status");
        }
    }
}
