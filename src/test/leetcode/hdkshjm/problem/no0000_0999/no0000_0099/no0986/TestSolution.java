package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0986;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}}, new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}}, new int[][]{{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}}),
                Arguments.of(new int[][]{{1, 3}, {5, 9}}, new int[][]{}, new int[][]{}),
                Arguments.of(new int[][]{{1, 7}}, new int[][]{{3, 10}}, new int[][]{{3, 7}})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] firstList, int[][] secondList, int[][] expected) {
        int[][] actual = solution.intervalIntersection(firstList, secondList);
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) Assertions.assertArrayEquals(expected[i], actual[i]);
    }
}
