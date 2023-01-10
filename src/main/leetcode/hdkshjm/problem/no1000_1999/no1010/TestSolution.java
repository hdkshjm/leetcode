package leetcode.hdkshjm.problem.no1000_1999.no1010;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{30, 20, 150, 100, 40}, 3),
                Arguments.of(new int[]{60, 60, 60}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] time, int expected) {
        int actual = solution.numPairsDivisibleBy60(time);
        Assertions.assertEquals(expected, actual);
    }
}
