package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("class StringProcessor, method isValidPassword")
public class IsValidPasswordTest extends StringProcessorTest {
    @ParameterizedTest
    @ValueSource(strings = {
            "Passwor1",
            "ValuePassword123",
            "1Password",
            "1234567Q",
            "ABCDEFG8",
            "A1!@#$%^"
    })
    public void userCanCheckIfPasswordIsValid(String password) {
        assertTrue(stringProcessor.isValidPassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Passwo1",
            "InvalidPassword",
            "1password",
            "12345678",
            "ABCDEFGI",
            "&*!@#$%^",
            ""
    })
    public void userCanCheckIfPasswordIsNotValid(String password) {
        assertFalse(stringProcessor.isValidPassword(password));
    }

    @Test
    public void userGetsFalseIfPasswordIsNull() {
        assertFalse(stringProcessor.isValidPassword(null));
    }
}
