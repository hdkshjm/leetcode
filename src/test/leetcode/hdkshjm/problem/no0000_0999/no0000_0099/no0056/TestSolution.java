package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0056;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}, new int[][]{{1, 6}, {8, 10}, {15, 18}}),
                Arguments.of(new int[][]{{1, 4}, {4, 5}}, new int[][]{{1, 5}})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] intervals, int[][] expected) {
        int[][] actual = solution.merge(intervals);
        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) Assertions.assertArrayEquals(expected[i], actual[i]);
    }
}
