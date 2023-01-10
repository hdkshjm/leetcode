package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0053;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{5, 4, -1, 7, 8}, 23),
                Arguments.of(new int[]{-2, -1}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int expected) {
        int actual = solution.maxSubArray(nums);
        Assertions.assertEquals(expected, actual);
    }
}
