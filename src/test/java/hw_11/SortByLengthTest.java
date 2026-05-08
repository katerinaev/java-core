package hw_11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("class StringProcessor, method sortByLength")
public class SortByLengthTest extends StringProcessorTest {
    /**
     * Tests for sorting list by words length
     * - list with different word length: ["Java", "C", "Python"] -> ["C", "Java", "Python"]
     * - list with the same word length: ["aa", "bb', "cc"] -> ["aa", "bb', "cc"]
     * corner case
     *  - empty list: [] -> []
     */
    @Test
    public void userCanSortStringListWithDifferentWordLength() {
        List<String> inputList = Arrays.asList("Java", "C", "Python");
        List<String> sortedList = Arrays.asList("C", "Java", "Python");

        assertEquals(sortedList, stringProcessor.sortByLength(inputList));
    }

    @Test
    public void userCanSortStringListWithSameWordLength() {
        List<String> inputList = Arrays.asList("cc", "bb", "aa");
        List<String> sortedList = Arrays.asList("cc", "bb", "aa");

        assertEquals(sortedList, stringProcessor.sortByLength(inputList));
    }

    @Test
    public void userGetsEmptyListIfSortEmptyList() {
        List<String> inputList = List.of();
        List<String> result = stringProcessor.sortByLength(inputList);

        assertTrue(result.isEmpty());
    }
}
