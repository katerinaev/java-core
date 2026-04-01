package hw_3.task_2;
/*
Создайте класс MathConstants с полями:
final double PI = 3.14159
final double E = 2.71828
Реализуйте статические методы calculateCircleArea(double r) — площадь круга и
calculateCircumference(double r) — длина окружности.
В main: вызовите методы с разными значениями радиуса.
calculateExponentialGrowth(double initialValue, double rate, double time) —
расчет по формуле экспоненциального роста: result = initialValue * Math.pow(e, rate*time)
 */
public class MathConstants {
    final static double PI = 3.14159;
    static final double E = 2.71828;

    static double calculateCircumference(double r) {
        return  2 * PI * r;
    }

    static double calculateCircleArea(double r) {
        return  PI * r * r;
    }

    static double calculateExponentialGrowth(double initialValue, double rate, double time) {
        return initialValue * Math.pow(E, rate*time);
    }

    public static void main(String[] args) {
        System.out.println(calculateCircumference(5.5));
        System.out.println(calculateCircleArea(100.3));

        System.out.println(calculateExponentialGrowth(500, 0.1, 12));
    }
}
