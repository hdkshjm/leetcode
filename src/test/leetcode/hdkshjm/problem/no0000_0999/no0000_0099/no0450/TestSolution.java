package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0450;

import leetcode.hdkshjm.common.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{5, 3, 6, 2, 4, null, 7}, 3, new Integer[]{5, 4, 6, 2, null, null, 7}),
                Arguments.of(new Integer[]{5, 3, 6, 2, 4, null, 7}, 0, new Integer[]{5, 3, 6, 2, 4, null, 7}),
                Arguments.of(new Integer[]{}, 0, new Integer[]{}),
                Arguments.of(new Integer[]{0}, 0, new Integer[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int key, Integer[] expectedValues) {
        TreeNode root = TreeNode.create(values);
        TreeNode expected = TreeNode.create(expectedValues);
        TreeNode actual = solution.deleteNode(root, key);
        TreeNode.assertTreeNodeEquals(expected, actual);
    }
}
