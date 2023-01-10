package leetcode.hdkshjm.problem.no1000_1999.no1291;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(100, 300, Arrays.asList(123, 234)),
                Arguments.of(1000, 13000, Arrays.asList(1234, 2345, 3456, 4567, 5678, 6789, 12345))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void testMinRemoveToMakeValid(int low, int high, List<Integer> expected) {
        List<Integer> actual = solution.sequentialDigits(low, high);
        Assertions.assertEquals(expected, actual);
    }
}
