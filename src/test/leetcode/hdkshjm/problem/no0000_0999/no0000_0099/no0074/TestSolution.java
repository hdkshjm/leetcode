package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0074;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3, true),
                Arguments.of(new int[][]{{1}}, 2, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] matrix, int target, boolean expected) {
        boolean actual = solution.searchMatrix(matrix, target);
        Assertions.assertEquals(expected, actual);
    }
}
