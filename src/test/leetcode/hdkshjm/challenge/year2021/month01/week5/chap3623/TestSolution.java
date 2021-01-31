package leetcode.hdkshjm.challenge.year2021.month01.week5.chap3623;

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
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 3, 2}),
                Arguments.of(new int[]{3, 2, 1}, new int[]{1, 2, 3}),
                Arguments.of(new int[]{1, 1, 5}, new int[]{1, 5, 1}),
                Arguments.of(new int[]{1}, new int[]{1}),
                Arguments.of(new int[]{1, 3, 2}, new int[]{2, 1, 3}),
                Arguments.of(new int[]{2, 3, 1}, new int[]{3, 1, 2}),
                Arguments.of(new int[]{1, 2, 0, 3, 0, 1, 2, 4}, new int[]{1, 2, 0, 3, 0, 1, 4, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int[] expected) {
        solution.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        Assertions.assertArrayEquals(expected, nums);
    }
}
