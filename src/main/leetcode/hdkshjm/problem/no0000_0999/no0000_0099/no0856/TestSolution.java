package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0856;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("()", 1),
                Arguments.of("(())",2),
                Arguments.of("()()", 2),
                Arguments.of("(())()()(())",6)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, int expected) {
        int actual = solution.scoreOfParentheses(s);
        Assertions.assertEquals(expected, actual);
    }
}
