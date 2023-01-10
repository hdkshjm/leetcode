package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3614;

import leetcode.hdkshjm.challenge.year2021.month01.week4.chap3614.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}}, new int[][]{{1, 1, 1, 1}, {1, 2, 2, 2}, {1, 2, 3, 3}})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] mat, int[][] expected) {
        int[][] actual = solution.diagonalSort(mat);
        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }
}
