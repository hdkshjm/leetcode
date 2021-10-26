package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0226;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{4, 2, 7, 1, 3, 6, 9}, new Integer[]{4, 7, 2, 9, 6, 3, 1}),
                Arguments.of(new Integer[]{2, 1, 3}, new Integer[]{2, 3, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, Integer[] expectedValues) {
        TreeNode root = createNode(values);
        TreeNode expected = createNode(expectedValues);
        root = solution.invertTree(root);
        assertTreeNodeEquals(expected, root);
    }

    void assertTreeNodeEquals(TreeNode expected, TreeNode root) {
        if (root == null && expected != null) Assertions.assertNotNull(root);
        if (root != null && expected == null) Assertions.assertNull(root);
        if (root == null && expected == null) return;

        Assertions.assertEquals(expected.val, root.val);
        assertTreeNodeEquals(root.left, expected.left);
        assertTreeNodeEquals(root.right, expected.right);
    }

    private static TreeNode createNode(Integer[] values) {
        if (values.length == 0)
            return null;

        Deque<TreeNode> queue = new ArrayDeque<>();
        TreeNode root = new TreeNode(values[0]);
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode node = queue.poll();

            if (values[i] != null) {
                node.left = new TreeNode(values[i]);
                queue.addLast(node.left);
            }
            i++;
            if (i >= values.length)
                break;

            if (values[i] != null) {
                node.right = new TreeNode(values[i]);
                queue.addLast(node.right);
            }
            i++;
        }
        return root;
    }
}
