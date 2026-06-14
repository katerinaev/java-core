package hw_12.task_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {
    /*
    Tests for user validation
    happy path: "Marina", 18, "marina@gmail.com" -> No Exception
    negative cases -> InvalidUserException, message ->
    - empty name: "", 19, "ivan@mail.ru" -> InvalidUserException, message - "Name must not be empty"
    - name with lower case: "ivan", 100, "ivan@example.com" -> InvalidUserException, message - "Name must begin with capital letter"
    - age lower 18: "Jerry", 17, "jerry@mail.com" -> InvalidUserException, message - "User age must be between 18 and 100"
    - age over 100: "Tom", 101, "tom@mail.com" -> InvalidUserException, message - "User age must be between 18 and 100"
    - empty email: "Tom", 20, "" -> InvalidUserException, message - "Email must not be empty"
    - null email: "Tom", 99, null -> InvalidUserException, message - "Email must not be empty"
    - invalid email: "Tom", 55, "invalid-email" -> InvalidUserException, message - "Invalid email"
     */
    private UserValidator validator = new UserValidator();

    @Test
    void testValidUser() {
        User user = new User("Marina", 18, "marina@gmail.com");
        assertDoesNotThrow(() -> validator.validate(user));
    }

    @ParameterizedTest
    @MethodSource("invalidUsers")
    void testInvalidUsersAndThrowCorrectExceptionMessage(User user, String expectedMessage) {
        InvalidUserException exception = assertThrows(InvalidUserException.class, () -> validator.validate(user));
        assertEquals(expectedMessage, exception.getMessage());
    }

    static Stream<Arguments> invalidUsers() {
        return Stream.of(
                Arguments.of(
                        new User("", 19, "ivan@mail.ru"),
                        "Name must not be empty"
                ),
                Arguments.of(
                        new User("ivan", 100, "ivan@example.com"),
                        "Name must begin with capital letter"
                ),
                Arguments.of(
                        new User("Jerry", 17, "jerry@mail.com"),
                        "User age must be between 18 and 100"
                ),
                Arguments.of(
                        new User("Tom", 101, "tom@mail.com"),
                        "User age must be between 18 and 100"
                ),
                Arguments.of(
                        new User("Tom", 20, ""),
                        "Email must not be empty"
                ),
                Arguments.of(
                        new User("Tom", 99, null),
                        "Email must not be empty"
                ),
                Arguments.of(
                        new User("Tom", 55, "invalid-email"),
                        "Invalid email"
                )
        );
    }

    @Test
    void testValidationDisabled() {
        validator.validationEnabled = false;
        User user = new User("marina", 118, "marinagmail.com");
        assertDoesNotThrow(() -> validator.validate(user));
    }
}
