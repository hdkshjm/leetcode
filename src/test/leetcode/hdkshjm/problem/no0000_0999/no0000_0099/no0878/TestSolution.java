package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0878;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(1, 2, 3, 2),
                Arguments.of(4, 2, 3, 6),
                Arguments.of(5, 2, 4, 10),
                Arguments.of(3, 6, 4, 8),
                Arguments.of(10, 10, 8, 50),
                Arguments.of(1000000000, 40000, 40000, 999720007)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int n, int a, int b, int expected) {
        int actual = solution.nthMagicalNumber(n, a, b);
        Assertions.assertEquals(expected, actual);
    }
}
