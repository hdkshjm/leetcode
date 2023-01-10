package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0496;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}, new int[]{-1, 3, -1}),
                Arguments.of(new int[]{2, 4}, new int[]{1, 2, 3, 4}, new int[]{3, -1})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums1, int[] nums2, int[] expected) {
        int[] actual = solution.nextGreaterElement(nums1, nums2);
        Assertions.assertArrayEquals(expected, actual);
    }
}
