package leetcode.hdkshjm.challenge.year2020.month10.week5.chap3513;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 4, 7}, 2),
                Arguments.of(new int[]{2, 2, 2, 2, 2}, 5),
                Arguments.of(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3}, 27),
                Arguments.of(new int[]{-100, -100, 0, 0, 0, 100, 100, 0, 0}, 12),
                Arguments.of(new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3}, 10),
                Arguments.of(new int[]{-72, -93, -42, 88, 35, -86, -8, -10, 98, -78}, 10),
                Arguments.of(new int[]{2, 1}, 2),
                Arguments.of(new int[]{1, 2, 1, 3, 0, 0, 2, 2, 1, 3, 3}, 23)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int expected) {
        int actual = solution.findNumberOfLIS(nums);
        Assertions.assertEquals(expected, actual);
    }
}
