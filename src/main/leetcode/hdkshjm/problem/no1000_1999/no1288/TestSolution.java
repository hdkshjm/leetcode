package leetcode.hdkshjm.problem.no1000_1999.no1288;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 4}, {3, 6}, {2, 8}}, 2),
                Arguments.of(new int[][]{{1, 4}, {2, 3}}, 1),
                Arguments.of(new int[][]{{3, 10}, {4, 10}, {5, 11}}, 2),
                Arguments.of(new int[][]{{1, 2}, {1, 4}, {3, 4}}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void testMinRemoveToMakeValid(int[][] intervals, int expected) {
        int actual = solution.removeCoveredIntervals(intervals);
        Assertions.assertEquals(expected, actual);
    }
}
