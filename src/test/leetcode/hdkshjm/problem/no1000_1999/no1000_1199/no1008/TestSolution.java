package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1008;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import leetcode.hdkshjm.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{8, 5, 1, 7, 10, 12}, new Integer[]{8, 5, 10, 1, 7, null, 12}),
                Arguments.of(new int[]{1, 3}, new Integer[]{1, null, 3}),
                Arguments.of(new int[]{1, 2, 3}, new Integer[]{1, null, 2, null, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] preorder, Integer[] expectedValues) {
        TreeNode actual = solution.bstFromPreorder(preorder);
        TreeNode expected = createNode(expectedValues);
        assertEquals(expected, actual);
    }

    private void assertEquals(TreeNode actual, TreeNode expected) {
        if (expected != null && actual == null) {
            Assertions.fail("expected is " + expected.val + ", but actual is null");
        } else if (expected == null && actual != null) {
            Assertions.fail("expected is null, but actual is " + actual.val);
        }

        Assertions.assertEquals(expected.val, actual.val);
        if (expected.left != null && actual.left == null) {
            Assertions.fail("expected is " + expected.left.val + ", but actual is null");
        } else if (expected.left == null && actual.left != null) {
            Assertions.fail("expected is null, but actual is " + actual.left.val);
        } else if (expected.left != null && actual.left != null) {
            assertEquals(expected.left, actual.left);
        }

        if (expected.right != null && actual.right == null) {
            Assertions.fail("expected is " + expected.right.val + ", but actual is null");
        } else if (expected.right == null && actual.right != null) {
            Assertions.fail("expected is null, but actual is " + actual.right.val);
        } else if (expected.right != null && actual.right != null) {
            assertEquals(expected.right, actual.right);
        }
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
