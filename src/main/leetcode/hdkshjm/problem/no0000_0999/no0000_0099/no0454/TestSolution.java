package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0454;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums1, int[] nums2, int[] nums3, int[] nums4, int expected) {
        int actual = solution.fourSumCount(nums1, nums2, nums3, nums4);
        Assertions.assertEquals(expected, actual);
    }
}
