package leetcode.hdkshjm.challenge.year2020.month11.week3.chap3535;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}, new int[][]{{1, 6}, {8, 10}, {15, 18}}),
                Arguments.of(new int[][]{{1, 4}, {4, 5}}, new int[][]{{1, 5}}),
                Arguments.of(new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}}, new int[][]{{1, 10}})

        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] intervals, int[][] expected) {
        int[][] actual = solution.merge(intervals);
        Arrays.sort(intervals, (o1, o2) -> {
            return o1[0] - o2[0];
        });
        Arrays.sort(actual, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }
}
