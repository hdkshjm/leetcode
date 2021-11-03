package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0980;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}}, 2),
                Arguments.of(new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}}, 4),
                Arguments.of(new int[][]{{0, 1}, {2, 0}}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] grid, int expected) {
        int actual = solution.uniquePathsIII(grid);
        Assertions.assertEquals(expected, actual);
    }
}
