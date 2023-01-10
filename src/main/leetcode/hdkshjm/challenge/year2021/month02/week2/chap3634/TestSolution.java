package leetcode.hdkshjm.challenge.year2021.month02.week2.chap3634;

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
                Arguments.of(new Integer[]{4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8},
                        new Integer[]{30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, Integer[] expectedValues) {
        TreeNode root = createNode(values);
        TreeNode expected = createNode(expectedValues);
        TreeNode actual = solution.convertBST(root);
        AssertNodeEquals(expected, actual);
    }

    private void AssertNodeEquals(TreeNode expected, TreeNode actual) {
        if (expected == null && actual == null) return;
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(expected.val, actual.val);
        AssertNodeEquals(expected.left, actual.left);
        AssertNodeEquals(expected.right, actual.right);
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
