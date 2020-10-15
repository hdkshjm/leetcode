package leetcode.hdkshjm.month10.week3.chap3495;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{0, 30}, {5, 10}, {15, 20}}, 2),
                Arguments.of(new int[][]{{7, 10}, {2, 4}}, 1),
                Arguments.of(new int[][]{{13, 15}, {1, 13}}, 1),
                Arguments.of(new int[][]{{9, 16}, {6, 16}, {1, 9}, {3, 15}}, 3),
                Arguments.of(new int[][]{{8, 14}, {12, 13}, {6, 13}, {1, 9}}, 3),
                Arguments.of(new int[][]{{15, 16}, {10, 15}, {16, 25}}, 1),
                Arguments.of(new int[][]{{1, 8}, {6, 20}, {9, 16}, {13, 17}}, 3),
                Arguments.of(new int[][]{{0, 30}, {5, 10}, {15, 20}}, 2),
                Arguments.of(new int[][]{{1080, 2236}, {3325, 5014}, {1397, 3851}, {54, 1519}, {1794, 2238}, {2907, 4858}}, 3)

        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] intervals, int expected) {
        Assertions.assertEquals(expected, solution.minMeetingRooms(intervals)
        );
    }
}
