package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0035;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
                Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
                Arguments.of(new int[]{1, 3, 5, 6}, 7, 4),
                Arguments.of(new int[]{1, 3, 5, 6}, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int target, int expected) {
        int actual = solution.searchInsert(nums, target);
        Assertions.assertEquals(expected, actual);
    }
}
