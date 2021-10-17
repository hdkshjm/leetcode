package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0437;

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
                Arguments.of(new Integer[]{10, 5, -3, 3, 2, null, 11, 3, -2, null, 1}, 8, 3),
                Arguments.of(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1}, 22, 3),
                Arguments.of(new Integer[]{0, 1, 1}, 1, 4),
                Arguments.of(new Integer[]{1, -2, -3, 1, 3, -2, null, -1}, 0, 2),
                Arguments.of(new Integer[]{7, 0, null, -1, -6, null, 1, null, null, -7}, 0, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int targetSum, int expected) {
        TreeNode root = createNode(values);
        int actual = solution.pathSum(root, targetSum);
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
