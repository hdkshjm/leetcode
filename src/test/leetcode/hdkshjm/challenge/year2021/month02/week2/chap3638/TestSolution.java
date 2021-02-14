package leetcode.hdkshjm.challenge.year2021.month02.week2.chap3638;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{0, 1}, {1, 0}}, 2),
                Arguments.of(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}}, 4),
                Arguments.of(new int[][]{{0}}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] grid, int expected) {
        int actual = solution.shortestPathBinaryMatrix(grid);
        Assertions.assertEquals(expected, actual);
    }
}
