package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0116;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3, 4, 5, 6, 7}, new Integer[]{1, null, 2, 3, null, 4, 5, 6, 7, null})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, Integer[] expectedNexts) {
        Node head = createNode(values);
        Node expected = createNode(values);
        Map<Integer, Node> map = new HashMap<>();
        find(expected, map);
        for (int i = 0; i < expectedNexts.length; i++) {
            if (expectedNexts[i] == null) continue;
            map.get(expectedNexts[i]).next = map.get(expectedNexts[i + 1]);
        }
        Node actual = solution.connect(head);
        assertTreeNodeEquals(expected, actual);
    }

    void find(Node head, Map<Integer, Node> map) {
        if (head == null) return;
        map.put(head.val, head);
        find(head.left, map);
        find(head.right, map);
    }

    void assertTreeNodeEquals(Node expected, Node actual) {
        if (actual == null && expected != null) Assertions.assertNotNull(actual);
        if (actual != null && expected == null) Assertions.assertNull(actual);
        if (actual == null && expected == null) return;

        if (actual.next == null && expected.next != null) Assertions.assertNotNull(actual.next);
        if (actual.next != null && expected.next == null) Assertions.assertNull(actual.next);
        if (actual.next == null && expected.next == null) return;

        Assertions.assertEquals(expected.val, actual.val);

        Assertions.assertEquals(expected.next.val, actual.next.val);
        assertTreeNodeEquals(actual.left, expected.left);
        assertTreeNodeEquals(actual.right, expected.right);
    }

    private static Node createNode(Integer[] values) {
        if (values.length == 0)
            return null;

        Deque<Node> queue = new ArrayDeque<>();
        Node root = new Node(values[0]);
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            Node node = queue.poll();

            if (values[i] != null) {
                node.left = new Node(values[i]);
                queue.addLast(node.left);
            }
            i++;
            if (i >= values.length)
                break;

            if (values[i] != null) {
                node.right = new Node(values[i]);
                queue.addLast(node.right);
            }
            i++;
        }
        return root;
    }
}
