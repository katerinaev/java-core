package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("class StringProcessor, method mapToLength")
public class MapToLengthTest extends StringProcessorTest {
    /**
     * Test for map list of strings to list of lengths
     *  happy path: ["Java", "Go", "Python"] -> [4, 2, 6]
     *  corner case: [] -> []
     */
    @Test
    public void userCanMapStringListToLengthList() {
        List<String> strings = Arrays.asList("Java", "Go", "Python");
        List<Integer> lengths = Arrays.asList(4, 2, 6);

        assertEquals(lengths, stringProcessor.mapToLengths(strings));
    }

    @Test
    public void userGetsEmptyListIfMapToLengthsEmptyList() {
        List<String> emptyList = List.of();
        List<Integer> lengths = List.of();

        assertEquals(lengths, stringProcessor.mapToLengths(emptyList));
    }
}
