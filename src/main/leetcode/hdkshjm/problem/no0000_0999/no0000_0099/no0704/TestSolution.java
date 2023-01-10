package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0704;


import leetcode.hdkshjm.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1),
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, -1, 0),
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 12, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int target, int expected) {
        int actual = solution.search(nums, target);
        Assertions.assertEquals(expected, actual);
    }
}
