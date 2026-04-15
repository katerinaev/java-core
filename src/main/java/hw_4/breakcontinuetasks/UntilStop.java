package hw_4.breakcontinuetasks;

import java.util.Scanner;

/*
4. Ввод строк до команды "stop" (использовать break)
Задача:
Программа должна запрашивать строки у пользователя и завершаться только тогда,
когда введена команда "stop".
 */
public class UntilStop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter command (stop - program is over)");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            System.out.println("Entered command: " + command);
        }

        System.out.println("Program is terminated");
    }
}
