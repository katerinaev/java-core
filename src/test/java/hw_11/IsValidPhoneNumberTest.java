package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("class StringProcessor, method isValidPhoneNumber")
public class IsValidPhoneNumberTest extends StringProcessorTest {
    /**
     * Tests for phone number validation
     * happy path
     *  - one digit in country code: "+1 1234567890" -> true
     *  - two digits in country code: "+12 1234567890" -> true
     *  - three digits in country code: "+123 1234567890" -> true
     * negative cases
     *  - no + in phone number "1 1234567890" -> false
     *  - no country code: "+ 1234567890" -> false
     *  - 4 digits in country code: "+1234 1234567890" -> false
     *  - less than 10 digits in phone number: "+123 123456789" -> false
     *  - more than 10 digits in phone number: "+123 12345678911" -> false
     *  - phone number without space: "+1231234567890" -> false
     *  - phone number with 2 spaces: "+123  1234567890" -> false
     *  - phone number with letters: "+123 abcdefghij" -> false
     *  - phone number with letters: "+abc 1234567890" -> false
     *  - empty string "" -> false
     *  null - IllegalArgumentException
     */
    @ParameterizedTest
    @ValueSource(strings = {
            "+1 1234567890",
            "+12 1234567890",
            "+123 1234567890"
    })
    public void userCanCheckThatPhoneNumberIsValid(String phoneNumber) {
        boolean actualResult = stringProcessor.isValidPhoneNumber(phoneNumber);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "1 1234567890",
            "+ 1234567890",
            "+1234 1234567890",
            "+123 123456789",
            "+123 12345678911",
            "+1231234567890",
            "+123  1234567890",
            "+123 abcdefghij",
            "+abc 1234567890",
            ""
    })
    public void userCanCheckThatPhoneNumberIsNotValid(String phoneNumber) {
        boolean actualResult = stringProcessor.isValidPhoneNumber(phoneNumber);
        assertFalse(actualResult);
    }

    @Test
    public void userCannotValidNullPhoneNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.isValidPhoneNumber(null);
        }, "phone number cannot be null");
    }
}
