package leetcode.hdkshjm.month11.week1.chap3483;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSolution {

    Solution s = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][] { { 1, 4 }, { 3, 6 }, { 2, 8 } }, 2),
                Arguments.of(new int[][] { { 1, 4 }, { 2, 3 } }, 1),
                Arguments.of(new int[][] { { 0, 10 }, { 5, 12 } }, 2),
                Arguments.of(new int[][] { { 3, 10 }, { 4, 10 }, { 5, 11 } }, 2),
                Arguments.of(new int[][] { { 1, 2 }, { 1, 4 }, { 3, 4 } }, 1)
                );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] intervals, int expected) {
        int result = s.removeCoveredIntervals(intervals);
        Assertions.assertEquals(expected, result);
    }
}
