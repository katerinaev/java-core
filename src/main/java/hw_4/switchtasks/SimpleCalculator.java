package hw_4.switchtasks;

import java.util.Scanner;

/*
5. Простой калькулятор с использованием switch
Задача:
Программа принимает два числа и оператор (+, -, *, /),
затем выполняет операцию и выводит результат.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        double result = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        double first = scanner.nextDouble();

        System.out.print("Enter second operand: ");
        double second = scanner.nextDouble();

        System.out.print("Enter operation sign: ");
        String sign = scanner.next();

        switch (sign) {
            case "+" -> result = first + second;
            case "-" -> result = first - second;
            case "*" -> result = first * second;
            case "/" -> {
                if (second == 0) {
                    System.out.println("Can't divide by zero!");
                    return;
                } else {
                    result = first / second;
                }
            }
            default -> {
                System.out.println("Unknown operation");
                return;
            }
        }
        System.out.println("Operation result: " + result);
    }

}
