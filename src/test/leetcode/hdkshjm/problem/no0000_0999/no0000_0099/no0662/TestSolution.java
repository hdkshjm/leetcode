package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0662;


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
                Arguments.of(new Integer[]{1, 3, 2, 5, 3, null, 9}, 4),
                Arguments.of(new Integer[]{1, 3, null, 5, 3}, 2),
                Arguments.of(new Integer[]{1, 3, 2, 5}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int expected) {
        TreeNode root = TreeNode.create(values);
        int actual = solution.widthOfBinaryTree(root);
        Assertions.assertEquals(expected, actual);
    }
}
