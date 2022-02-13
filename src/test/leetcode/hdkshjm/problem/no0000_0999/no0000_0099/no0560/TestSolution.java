package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0560;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1}, 2, 2),
                Arguments.of(new int[]{1, 2, 3}, 3, 2),
                Arguments.of(new int[]{1, 1}, 1, 2),
                Arguments.of(new int[]{-1, -1, 1}, 1, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int k, int expected) {
        int actual = solution.subarraySum(nums, k);
        Assertions.assertEquals(expected, actual);
    }
}
