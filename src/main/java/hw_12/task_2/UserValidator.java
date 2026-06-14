package hw_12.task_2;

import java.util.regex.Pattern;

import static java.lang.Character.isUpperCase;

public class UserValidator {
    boolean validationEnabled = true;

    static final String REGEX_EMAIL = "^[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}$";

    public void validate(User user) {
        if (!validationEnabled) {
            return;
        }
        validateName(user.getName());
        validateAge(user.getAge());
        validateEmail(user.getEmail());
    }

    private void validateName(String name) {
        if(name == null || name.isEmpty()) {
            throw new InvalidUserException("Name must not be empty");
        }
        if (!isUpperCase(name.charAt(0))) {
            throw new InvalidUserException("Name must begin with capital letter");
        }
    }

    private void validateAge(int age) {
        if (age < 18 || age > 100) {
            throw new InvalidUserException("User age must be between 18 and 100");
        }
    }

    private void validateEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new InvalidUserException("Email must not be empty");
        } else if (!Pattern.compile(REGEX_EMAIL).matcher(email).matches()) {
            throw new InvalidUserException("Invalid email");
        }
    }
}
