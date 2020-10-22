package leetcode.hdkshjm.challenge.month10.week2.chap3490;

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
                Arguments.of(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}, 2),
                Arguments.of(new int[][]{{1, 2}}, 1),
                Arguments.of(new int[][]{{2, 3}, {2, 3}}, 1),
                Arguments.of(new int[][]{{-2147483646,-2147483645}, {2147483646,2147483647}}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void testFindMinArrowShots(int[][] points, int expected) {
        int result = solution.findMinArrowShots(points);
        Assertions.assertEquals(expected, result);
    }
}