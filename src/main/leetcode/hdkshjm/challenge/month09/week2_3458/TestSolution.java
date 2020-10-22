package leetcode.hdkshjm.challenge.month09.week2_3458;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(
                        new int[][] { { 1, 3 }, { 6, 9 } }, 
                        new int[] { 2, 5 },
                        new int[][] { { 1, 5 }, { 6, 9 } }),
                Arguments.of(
                        new int[][] { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } }, 
                        new int[] { 4, 8 },
                        new int[][] { { 1, 2 }, { 3, 10 }, { 12, 16 } })

        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void insert(int[][] intervals, int[] newInterval, int[][] expected) {
        int[][] result = solution.insert(intervals, newInterval);

        for (int[] r : result) {
            System.out.println("[test]result=" + Arrays.toString(r));
        }

        for (int[] e : expected) {
            System.out.println("[test]expected=" + Arrays.toString(e));
        }

        Assertions.assertArrayEquals(expected, result);

    }




}
