package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1337;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}}, 3, new int[]{2, 0, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] mat, int k, int[] expected) {
        int[] actual = solution.kWeakestRows(mat, k);
        Assertions.assertArrayEquals(expected, actual);
    }
}
