package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0004;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 3}, new int[]{2}, 2.0),
                Arguments.of(new int[]{1, 2}, new int[]{3, 4}, 2.5),
                Arguments.of(new int[]{0, 0}, new int[]{0, 0}, 0.0),
                Arguments.of(new int[]{}, new int[]{1}, 1.0),
                Arguments.of(new int[]{1, 1}, new int[]{1, 2}, 1.0)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void findMedianSortedArrays(int[] nums1, int[] nums2, double expected) {
        double result = solution.findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(expected, result);
    }
}
