package hw_1;

public class MathOperations {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int findMax(int x, int y) {
        return Math.max(x, y);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return side * 4;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9/5 + 32;
    }

    public static double fahrenheitToCelsius(double f)  {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.println("1. Результат сложения: " + add(5, 2));
        System.out.println("1. Результат вычитания: " + subtract(105, 15));
        System.out.println("1. Результат умножения: " + multiply(5, 2));
        System.out.println("1. Результат деления: " + divide(5, 2));

        System.out.println("2. Max of two numbers: " + findMax(-100, 100));

        System.out.println("3. Difference between two numbers: " + difference(-100, 100));

        System.out.println("4. Area of square is: " + squareArea(6));
        System.out.println("4. Perimeter of square is: " + squarePerimeter(6));

        System.out.println("5. Seconds to minutes: " + convertSecondsToMinutes(25));

        System.out.println("6. Average speed: " + averageSpeed(25.0, 0.25));

        System.out.println("7. Hypotenuse is: " + findHypotenuse(2.0, 3.0));

        System.out.println("8. Circumference of circle is: " + circleCircumference(10.0));

        System.out.println("9. Percentage is: " + calculatePercentage(10.0, 5) + "%");

        System.out.println("10. Celsius to Fahrenheit: " + celsiusToFahrenheit(37.7));
        System.out.println("10. Fahrenheit to Celsius: " + fahrenheitToCelsius(100));
    }
}
