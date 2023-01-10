package leetcode.hdkshjm.challenge.year2021.month02.week3.chap3642;

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
                Arguments.of("a1b2", Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2")),
                Arguments.of("3z4", Arrays.asList("3z4", "3Z4")),
                Arguments.of("12345", Arrays.asList("12345")),
                Arguments.of("0", Arrays.asList("0"))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String S, List<String> expected) {
        List<String> actual = solution.letterCasePermutation(S);
        Assertions.assertEquals(expected, actual);
    }
}
