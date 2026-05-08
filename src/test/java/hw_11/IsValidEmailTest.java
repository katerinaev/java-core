package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("class StringProcessor, method isValidEmail")
public class IsValidEmailTest extends StringProcessorTest {
    /**
     * happy path
     *  standard email "test@example.com" -> true
     *  with dot in name "user.name@domain.co" -> true
     *  with min letters "a@b.cc" -> true
     *  with underscore, hyphen "a_b-c@sub.mail.org
     * negative cases
     *  nu domain name: "bad@.com" -> false
     *  no @: "no-at-symbol.con" -> false
     *  no username: "@missing-user.com" -> false
     *  domain is empty: "user@domain" -> false
     *  domain < 2 chars: "user@domain.c" -> false
     *  two @: "user@@domain.com" -> false
     *  "ivan ivanov@site.com" -> false
     *  "" -> false
     *  null check: null -> false
     */
    boolean isValid;
    @ParameterizedTest
    @ValueSource(strings = {
            "test@example.com",
            "user.name@domain.co",
            "a@b.cc",
            "a_b-c@sub.mail.org"
    })
    public void userCanCheckThatEmailIsValid(String email) {
        isValid = stringProcessor.isValidEmail(email);
        assertTrue(isValid);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            // negative cases
            "bad@.com",
            "no-at-symbol.con",
            "@missing-user.com",
            "user@domain",
            "user@domain.c",
            "user@@domain.com",
            "ivan ivanov@site.com",
            ""
    })
    public void userCanCheckThatEmailIsNotValid(String email) {
        isValid = stringProcessor.isValidEmail(email);
        assertFalse(isValid);
    }

    @Test
    public void userCanCheckThatNullEmailIsNotValid() {
        boolean isNullEmail = stringProcessor.isValidEmail(null);
        assertFalse(isNullEmail);
    }
}
