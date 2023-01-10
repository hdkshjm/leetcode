package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0452;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}, 2),
                Arguments.of(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}, 4),
                Arguments.of(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] points, int expected) {
        int actual = solution.findMinArrowShots(points);
        Assertions.assertEquals(expected, actual);
    }
}
