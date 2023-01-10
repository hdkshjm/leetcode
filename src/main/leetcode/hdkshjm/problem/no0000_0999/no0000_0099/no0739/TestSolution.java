package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0739;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{73, 74, 75, 71, 69, 72, 76, 73}, new int[]{1, 1, 4, 2, 1, 1, 0, 0}),
                Arguments.of(new int[]{30, 40, 50, 60}, new int[]{1, 1, 1, 0}),
                Arguments.of(new int[]{30, 60, 90}, new int[]{1, 1, 0})
                );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] temperatures, int[] expected) {
        int[] actual = solution.dailyTemperatures(temperatures);
        Assertions.assertArrayEquals(expected, actual);
    }
}
