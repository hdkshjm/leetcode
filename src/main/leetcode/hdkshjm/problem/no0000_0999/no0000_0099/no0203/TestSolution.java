package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0203;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution s = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3, 4, 5, 6}, 6, new Integer[]{1, 2, 3, 4, 5}),
                Arguments.of(new Integer[]{}, 1, new Integer[]{}),
                Arguments.of(new Integer[]{7, 7, 7, 7}, 7, new Integer[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int val, Integer[] expectedValues) {
        ListNode head = create(values);
        ListNode expected = create(expectedValues);

        ListNode actual = s.removeElements(head, val);
        while (expected != null && actual != null) {
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    private ListNode create(Integer[] values) {
        ListNode node = null;
        for (int i = 0; i < values.length; i++) {
            node = new ListNode(values[values.length - 1 - i], node);
        }
        return node;
    }
}
