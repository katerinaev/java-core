package hw_8.exceptions.task_2;
/*
2. Обработка непроверяемого исключения
Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
Используйте ArithmeticException для обработки ошибки деления на ноль.
Конструкция try-catch будет необходима для перехвата и обработки исключения.
 */
public class DivisionOfNumbers {
    public static void  divideNumbers(int x, int y) {
        try {
            double result = (double) x / y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        divideNumbers(35, 2);
    }
}
