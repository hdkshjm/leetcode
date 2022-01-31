package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0189;


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
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}),
                Arguments.of(new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void twoSum(int[] nums, int k, int[] expected) {
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(nums));
        Assertions.assertArrayEquals(expected, nums);
    }
}
