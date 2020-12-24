package leetcode.hdkshjm.challenge.month12.week4.chap3579;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{2, 1, 4, 3}),
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{1}, new int[]{1}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{2, 1, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] values, int[] expectedValues) {
        ListNode head = create(values);
        ListNode expected = create(expectedValues);
        ListNode actual = solution.swapPairs(head);

        if (expected == null && actual == null) {
            Assertions.assertTrue(true);
            return;
        }

        while (expected != null && actual != null) {
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    private ListNode create(int[] values) {
        ListNode node = null;
        for (int i = 0; i < values.length; i++) {
            node = new ListNode(values[values.length - 1 - i], node);
        }
        return node;
    }
}
