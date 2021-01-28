package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3612;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("ab", "acb", true),
                Arguments.of("", "", false),
                Arguments.of("a", "", true),
                Arguments.of("", "A", true)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, String t, boolean expected) {
        boolean actual = solution.isOneEditDistance(s, t);
        Assertions.assertEquals(expected, actual);
    }
}
