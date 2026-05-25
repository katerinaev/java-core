package hw_11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringProcessor {
    // 2. Подсчёт количества гласных в строке
    // Напишите тесты для метода, который считает количество гласных букв в строке:
    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }

    // 3. Разворот строки
    // Напишите тесты для метода, который переворачивает строку:
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    // 6. Проверка валидности email
    // Напишите тесты для метода, который проверяет, является ли строка валидным email:
    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

    // 9. Counting the Number of Words in a String
    // Write tests for the method that counts the number of words in a string:
    public int countWords(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Sentence must not be null");
        }
        sentence = sentence.trim();
        return sentence.isEmpty() ? 0 : sentence.split("\\s+").length;
    }

    // 10. Checking the validity of a phone number
    //
    // Write tests for the method that checks the validity of a phone number:
    public boolean isValidPhoneNumber(String phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Phone number cannot be null");
        }
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }

    // 12. Sorting a list of strings by length
    public List<String> sortByLength(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    // 13. Checking if a string is an anagram of another
    public boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        char[] arr1 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] arr2 = str2.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    // 15. Converting a list of strings to a list of their lengths
    public List<Integer> mapToLengths(List<String> words) {
        return words.stream().map(String::length).collect(Collectors.toList());
    }

    // 16. Splitting a string into parts using a separator
    public String[] splitString(String input, String delimiter) {
        return input.split(delimiter);
    }

    // 17. Checking the correctness of the password (length, symbols, numbers)
    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) return false;
        return password.matches("^(?=.*[A-Z])(?=.*\\d).+$");
    }
}
