package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3617;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}}, 2),
                Arguments.of(new int[][]{{1, 2, 3}, {3, 8, 4}, {5, 3, 5}}, 1),
                Arguments.of(new int[][]{{1, 2, 1, 1, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 1, 1, 2, 1}}, 0),
                Arguments.of(new int[][]{{1, 10, 6, 7, 9, 10, 4, 9}}, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] heights, int expected) {
        int actual = solution.minimumEffortPath(heights);
        Assertions.assertEquals(expected, actual);
    }
}
