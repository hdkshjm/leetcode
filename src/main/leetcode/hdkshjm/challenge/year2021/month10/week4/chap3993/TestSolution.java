package leetcode.hdkshjm.challenge.year2021.month10.week4.chap3993;

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
                Arguments.of(new int[]{4, 3, 2, 3, 5, 2, 1}, 4, true),
                Arguments.of(new int[]{1, 2, 3, 4}, 3, false),
                Arguments.of(new int[]{2, 2, 2, 2, 3, 4, 5}, 4, false),
                Arguments.of(new int[]{1, 1, 1, 1, 2, 2, 2, 2}, 2, true),
                Arguments.of(new int[]{98, 102, 9, 36, 57, 44, 30, 35, 28, 9851, 90, 29, 9751, 44, 66, 9652}, 8, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int k, boolean expected) {
        boolean actual = solution.canPartitionKSubsets(nums, k);
        Assertions.assertEquals(expected, actual);
    }
}
