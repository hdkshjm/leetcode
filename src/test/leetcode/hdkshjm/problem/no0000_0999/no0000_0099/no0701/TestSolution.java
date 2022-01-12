package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0701;


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
                Arguments.of(new Integer[]{4, 2, 7, 1, 3}, 5, new Integer[]{4, 2, 7, 1, 3, 5}),
                Arguments.of(new Integer[]{40, 20, 60, 10, 30, 50, 70}, 25, new Integer[]{40, 20, 60, 10, 30, 50, 70, null, null, 25}),
                Arguments.of(new Integer[]{4, 2, 7, 1, 3, null, null, null, null, null, null}, 5, new Integer[]{4, 2, 7, 1, 3, 5})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int val, Integer[] expectedValues) {
        TreeNode root = TreeNode.create(values);
        TreeNode expected = TreeNode.create(expectedValues);
        TreeNode actual = solution.insertIntoBST(root, val);
        TreeNode.assertTreeNodeEquals(expected, actual);
    }
}
