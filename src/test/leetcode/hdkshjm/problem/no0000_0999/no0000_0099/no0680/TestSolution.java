package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0680;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("aba", true),
                Arguments.of("abca", true),
                Arguments.of("abc", false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, boolean expected) {
        boolean actual = solution.validPalindrome(s);
        Assertions.assertEquals(expected, actual);
    }
}
