package hw_4.dowhiletasks;

import java.util.Scanner;

/*
2. Проверка пароля
Задача:
Реализуйте программу, которая запрашивает у пользователя пароль, пока он не введёт верный
(пароль заранее задан в коде).
 */
public class PasswordCheck {
    public static void main(String[] args) {
        String correctPassword = "admin";
        String enteredPassword;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter password: ");
            enteredPassword = scanner.nextLine();
        } while (!enteredPassword.equals(correctPassword));

        System.out.println("Access granted!");
    }
}
