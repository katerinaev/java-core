package hw_9.func_interfaces.task_1;
/*
1. Создайте свой функциональный интерфейс
Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат
операции. Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.
Объявите интерфейс с одним методом, например:
interface MathOperation { double operate(double a, double b); }
В main() создайте переменные типа MathOperation и реализуйте их с помощью лямбд:
(a, b) -> a + b
(a, b) -> a - b
(a, b) -> a * b
(a, b) -> a / b
Вызовите метод operate(a, b) для проверки
 */
public class Main {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        };

        System.out.println(addition.operate(5, 5));
        System.out.println(subtraction.operate(5, 5));
        System.out.println(multiplication.operate(5, 5));
        System.out.println(division.operate(15, 2));
    }
}
