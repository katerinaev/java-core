package hw_8.exceptions.task_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
4. Создание и использование собственного непроверяемого исключения
Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет,
является ли строка правильным электронным адресом. Если строка не удовлетворяет критериям,
функция должна выбрасывать непроверяемое исключение.
Создайте класс исключения, наследуемый от RuntimeException.
Используйте регулярные выражения (Pattern и Matcher из пакета java.util.regex) для проверки
формата строки.
Используйте throw для генерации исключения при обнаружении невалидного адреса.
"^[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}$"
 */
public class EmailValidation {
    public static void checkEmail(String email) {
        if (email == null) {
            throw new InvalidEmailException("Email must not be null");
        }

        String regex = "^[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Email " + email + " is valid.");
        } else throw new InvalidEmailException("Email " + email + " is not valid.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        try {
            checkEmail(email);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
