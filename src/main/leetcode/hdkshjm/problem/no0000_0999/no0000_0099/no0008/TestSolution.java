package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0008;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("42", 42),
                Arguments.of("   -42", -42),
                Arguments.of("4193 with words", 4193),
                Arguments.of("-2147483649", -2147483648),
                Arguments.of("2147483648", 2147483647),
                Arguments.of("+-12", 0),
                Arguments.of("", 0),
                Arguments.of(".1", 0),
                Arguments.of("  +  413", 0),
                Arguments.of("  0000000000012345678", 12345678)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, int expected) {
        int result = solution.myAtoi(s);
        Assertions.assertEquals(expected, result);
    }
}
