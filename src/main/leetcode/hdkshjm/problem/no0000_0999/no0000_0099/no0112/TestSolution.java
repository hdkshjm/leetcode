package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0112;

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
                Arguments.of(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1}, 22, true),
                Arguments.of(new Integer[]{1, 2, 3}, 5, false),
                Arguments.of(new Integer[]{1, 2}, 1, false),
                Arguments.of(new Integer[]{}, 0, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int targetSum, boolean expected) {
        TreeNode root = TreeNode.create(values);
        boolean actual = solution.hasPathSum(root, targetSum);
        Assertions.assertEquals(expected, actual);
    }
}
