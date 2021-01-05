package leetcode.hdkshjm.challenge.year2020.month10.week2.chap3492;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("ab", "ba", true),
                Arguments.of("ab", "ab", false),
                Arguments.of("aa", "aa", true),
                Arguments.of("aaaaaaabc", "aaaaaaacb", true),
                Arguments.of("aaaaaaabc", "aaaaaaabc", true),
                Arguments.of("", "aa", false),
                Arguments.of("abcd", "badc", false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void buddyStrings(String A, String B, boolean expected) {
        boolean result = solution.buddyStrings(A, B);
        Assertions.assertEquals(expected, result);
    }
}