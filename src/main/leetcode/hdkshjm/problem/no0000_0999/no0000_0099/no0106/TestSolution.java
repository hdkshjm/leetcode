package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0106;

import leetcode.hdkshjm.common.TreeNode;
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
                Arguments.of(new int[]{9,3,15,20,7},new int[]{9,15,7,20,3}, new Integer[]{3,9,20,null,null,15,7}),
                Arguments.of(new int[]{-1},new int[]{-1}, new Integer[]{-1})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] inorder, int[] postorder, Integer[] expectedValues) {
        TreeNode expected = createNode(expectedValues);
        TreeNode actual = solution.buildTree(inorder, postorder);
        assertTreeNodeEquals(expected, actual);
    }

    void assertTreeNodeEquals(TreeNode expected, TreeNode actual) {
        if (actual == null && expected != null) Assertions.assertNotNull(actual);
        if (actual != null && expected == null) Assertions.assertNull(actual);
        if (actual == null && expected == null) return;

        Assertions.assertEquals(expected.val, actual.val);
        assertTreeNodeEquals(actual.left, expected.left);
        assertTreeNodeEquals(actual.right, expected.right);
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
