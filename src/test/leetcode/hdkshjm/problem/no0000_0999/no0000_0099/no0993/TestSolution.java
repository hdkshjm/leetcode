package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0993;


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
                Arguments.of(new Integer[]{1, 2, 3, 4}, 4, 3, false),
                Arguments.of(new Integer[]{1, 2, 3, null, 4, null, 5}, 5, 4, true),
                Arguments.of(new Integer[]{1, 2, 3, null, 4}, 2, 3, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int x, int y, boolean expected) {
        TreeNode root = createNode(values);
        boolean actual = solution.isCousins(root, x, y);
        Assertions.assertEquals(expected, actual);
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
