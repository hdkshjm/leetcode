
package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0142;


import leetcode.hdkshjm.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(new int[]{3, 2, 0, -4}, 1),
                Arguments.of(new int[]{3, 2, 0, -4, -5}, 1),
                Arguments.of(new int[]{3, 2, 0, -4, -5}, 2),
                Arguments.of(new int[]{1, 2}, 0),
                Arguments.of(new int[]{1}, -1)
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] values, int expected) {
        ListNode head = new ListNode(values);
        ListNode node = head;

        for (int i = 0; i < expected; i++) node = node.next;
        ListNode cycle = node;

        while (node.next != null) node = node.next;

        node.next = cycle;
        ListNode actual = solution.detectCycle(head);
        Assertions.assertEquals(cycle.val, actual.val);

    }
}
