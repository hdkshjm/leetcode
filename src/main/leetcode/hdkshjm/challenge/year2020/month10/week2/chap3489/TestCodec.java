package leetcode.hdkshjm.challenge.year2020.month10.week2.chap3489;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

public class TestCodec {

    Codec c = new Codec();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(Arrays.asList(new Integer[]{2, 1, 3})),
                Arguments.of(Arrays.asList(new Integer[]{4, 2, 7, 1, 3, null, null, null, null, null, null})),
                Arguments.of(Arrays.asList(new Integer[]{})),
                Arguments.of(Arrays.asList(new Integer[]{40, 20, 60, 10, 30, 50, 70, null, null, 25}))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void testSerialize(List<Integer> values) {
        TreeNode root = createNode(values);

        String s = c.serialize(root);
        TreeNode result = c.deserialize(s);
        String s2 = c.serialize(result);


        System.out.println("s="+ s);
        Assertions.assertEquals(1, 1);
        if (root == null) {
            Assertions.assertEquals(null, result);
        } else {
            Assertions.assertEquals(root.val, result.val);
        }
        Assertions.assertEquals(s, s2);
    }

    private TreeNode createNode(List<Integer> values) {
        if (values.size() == 0)
            return null;

        Queue<TreeNode> queue = new ArrayDeque();
        TreeNode root = new TreeNode(values.get(0));
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < values.size()) {
            TreeNode node = queue.poll();

            if (values.get(i) != null) {
                node.left = new TreeNode(values.get(i));
                queue.add(node.left);
            }
            i++;
            if (i >= values.size())
                break;

            if (values.get(i) != null) {
                node.right = new TreeNode(values.get(i));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}