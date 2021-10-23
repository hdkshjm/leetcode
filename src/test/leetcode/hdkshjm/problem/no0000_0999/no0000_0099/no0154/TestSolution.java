package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0154;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 5, 6, 7, 0, 1, 4}, 0),
                Arguments.of(new int[]{1, 3, 5}, 1),
                Arguments.of(new int[]{3, 1}, 1),
                Arguments.of(new int[]{2, 2, 2, 0, 1}, 0),
                Arguments.of(new int[]{-1, -1, -1, -1}, -1),
                Arguments.of(new int[]{0, 0, 0, 0, 0}, 0),
                Arguments.of(new int[]{1, 1, 1, 1, 3}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int expected) {
        int result = solution.findMin(nums);
        Assertions.assertEquals(expected, result);
    }
}
