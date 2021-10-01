package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1143;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("abcde", "ace", 3),
                Arguments.of("abc", "abc", 3),
                Arguments.of("abc", "def", 0),
                Arguments.of("bsbininm", "jmjkbkjkv", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void testMinRemoveToMakeValid(String text1, String text2, int expected) {
        int result = solution.longestCommonSubsequence(text1, text2);
        Assertions.assertEquals(expected, result);
    }
}
