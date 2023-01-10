package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0430;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3, 4, 5, 6, null, null, null, 7, 8, 9, 10, null, null, 11, 12},
                        new Integer[]{1, 2, 3, 7, 8, 11, 12, 9, 10, 4, 5, 6}),
                Arguments.of(new Integer[]{1, 2, 3, 4, 5, 6, null, null, null, 7, 8, 9, 10, null, null, 11, 12},
                        new Integer[]{1, 2, 3, 7, 8, 11, 12, 9, 10, 4, 5, 6})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, Integer[] expectedValues) {
        Node expected = null;
        for (int i = expectedValues.length - 1; i >= 0; i--) {
            Node previous = new Node();
            previous.val = expectedValues[i];
            if (previous != null) previous.next = expected;
            if (expected != null) expected.prev = previous;
            expected = previous;
        }

        Node head = null;
        Node node = null;
        for (int i = 0; i < values.length; i++) {
            if (values[i] != null) {
                Node next = new Node();
                next.val = values[i];
                if (node == null) {
                    next.prev = node;
                } else if (node.next == null) {
                    next.prev = node;
                    node.next = next;
                } else {
                    node.child = next;
                }
                node = next;
                if (i == 0) head = node;
                continue;
            }
            if (node.prev != null) node = node.prev;
        }

        Node actual = solution.flatten(head);
        assertNodeEquals(expected, actual);


    }

    void assertNodeEquals(Node expected, Node actual) {
        while (expected != null) {
            Assertions.assertEquals(expected.val, actual.val);
            if (expected.child != null) assertNodeEquals(expected.child, actual.child);
            expected = expected.next;
            actual = actual.next;
        }
    }
}
