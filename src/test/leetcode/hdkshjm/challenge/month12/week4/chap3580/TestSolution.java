package leetcode.hdkshjm.challenge.month12.week4.chap3580;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[]{1, 2, 4, 7, 5, 3, 6, 8, 9})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] matrix, int[] expected) {

        int[] actual = solution.findDiagonalOrder(matrix);
        Assertions.assertArrayEquals(expected, actual);
    }
}
