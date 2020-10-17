package leetcode.hdkshjm.month10.week3.chap3497;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 3, true),
                Arguments.of(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 13, false),
                Arguments.of(new int[][]{{}}, 0, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] matrix, int target, boolean expected) {
        boolean result = solution.searchMatrix(matrix, target);
        Assertions.assertEquals(expected, result);
    }
}
