package leetcode.hdkshjm.challenge.year2021.month01.week5.chap3621;

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
                Arguments.of(new Integer[]{3, 9, 20, null, null, 15, 7},
                        Arrays.asList(Arrays.asList(9), Arrays.asList(3, 15), Arrays.asList(20), Arrays.asList(7))),
                Arguments.of(new Integer[]{1, 2, 3, 4, 5, 6, 7},
                        Arrays.asList(Arrays.asList(4), Arrays.asList(2), Arrays.asList(1, 5, 6), Arrays.asList(3), Arrays.asList(7)))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, List<List<Integer>> expected) {
        TreeNode root = createNode(values);
        List<List<Integer>> actual = solution.verticalTraversal(root);

        Assertions.assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            Assertions.assertEquals(expected.get(i), actual.get(i));
        }
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
