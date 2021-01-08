package leetcode.hdkshjm.challenge.year2021.month01.week1.chap3595;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb",1),
                Arguments.of("pwwkew", 3),
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, int expected) {
        int actual = solution.lengthOfLongestSubstring(s);
        Assertions.assertEquals(expected, actual);
    }
}
