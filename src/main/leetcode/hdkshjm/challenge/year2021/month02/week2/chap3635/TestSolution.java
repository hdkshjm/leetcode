package leetcode.hdkshjm.challenge.year2021.month02.week2.chap3635;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[][]{{7, null}, {13, 0}, {11, 4}, {10, 2}, {1, 0}}, new Integer[][]{{7, null}, {13, 0}, {11, 4}, {10, 2}, {1, 0}}),
                Arguments.of(new Integer[][]{}, new Integer[][]{})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[][] values, Integer[][] expectedValues) {
        Node head = createNode(values);
        Node expected = createNode(expectedValues);
        Node actual = solution.copyRandomList(head);

        while (expected != null) {
            Assertions.assertEquals(expected.val, actual.val);
            if (expected.random == null) Assertions.assertNull(actual.random);
            else Assertions.assertEquals(expected.random.val, actual.random.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    private Node createNode(Integer[][] values) {
        if (values.length == 0) return null;

        Node ret = null;
        List<Node> list = new ArrayList<>();
        Node node = null;
        for (int i = 0; i < values.length; i++) {
            Node previous = new Node(values[values.length - 1 - i][0]);
            previous.next = node;
            list.add(0, previous);
            node = previous;
            if (i == values.length - 1) ret = node;
        }

        for (int i = 0; i < values.length; i++) {
            if (values[i][1] != null) list.get(i).random = list.get(values[i][1]);
        }
        return ret;
    }
}
