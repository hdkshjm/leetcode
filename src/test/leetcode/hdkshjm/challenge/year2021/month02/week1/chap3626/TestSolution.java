package leetcode.hdkshjm.challenge.year2021.month02.week1.chap3626;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{3, 0, 4, null, 2, null, null, 1}, 1, 3, new Integer[]{3, 2, null, 1}),
                Arguments.of(new Integer[]{1}, 1, 2, new Integer[]{1}),
                Arguments.of(new Integer[]{1, null, 2}, 1, 3, new Integer[]{1, null, 2}),
                Arguments.of(new Integer[]{1, null, 2}, 2, 4, new Integer[]{2}),
                Arguments.of(new Integer[]{3, 2, 4, 1}, 2, 4, new Integer[]{3, 2, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int low, int high, Integer[] expectedValues) {
        TreeNode root = createNode(values);
        TreeNode actual = solution.trimBST(root, low, high);
        TreeNode expected = createNode(expectedValues);
        assertTreeNodeEquals(expected, actual);
    }

    private void assertTreeNodeEquals(TreeNode expected, TreeNode actual) {
        if (expected == null && actual == null) return;
        if (actual == null) Assertions.assertEquals(expected, actual);

        Assertions.assertEquals(expected.val, actual.val);
        assertTreeNodeEquals(expected.left, actual.left);
        assertTreeNodeEquals(expected.right, actual.right);
    }

    private TreeNode createNode(Integer[] values) {
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
