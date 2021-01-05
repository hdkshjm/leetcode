package leetcode.hdkshjm.challenge.year2020.month10.week4.chap3504;

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
                Arguments.of(new Integer[]{3, 9, 20, null, null, 15, 7}, 2),
                Arguments.of(new Integer[]{2, null, 3, null, 4, null, 5, null, 6}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void minDepth(Integer[] values, int expected) {
        TreeNode root = createNode(values);
        int actual = solution.minDepth(root);
        Assertions.assertEquals(expected, actual);
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
