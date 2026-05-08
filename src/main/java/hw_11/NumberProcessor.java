package hw_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberProcessor {
    // 1. Checking whether a number is even
    // Write tests for a method that determines whether a number is even:
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 4. Finding the Maximum Number in an Array
    // Write tests for the method that finds the maximum number in an array:
    public int findMax(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        return Arrays.stream(numbers).max().orElseThrow();
    }

    // 5. Checking if a year is a leap year
    // Write tests for the method that determines whether a year is a leap year:
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 7. Factorial of a Number
    // Write tests for the method that calculates the factorial of a number:
    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    // 8. Finding the Second Largest Number in an Array
    // Write tests for the method that finds the second largest number:
    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }

    // 11. Filter a list of numbers (leave only even ones)
    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}
