package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0070;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(7, 21),
                Arguments.of(44, 1134903170)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int n, int expected) {
        int actual = solution.climbStairs(n);
        Assertions.assertEquals(expected, actual);
    }
}
