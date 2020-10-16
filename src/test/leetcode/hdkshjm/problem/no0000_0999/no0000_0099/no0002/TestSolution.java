package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {

    Solution s = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{2, 4, 3}, new Integer[]{5, 6, 4}, new Integer[]{7, 0, 8}),
                Arguments.of(new Integer[]{0}, new Integer[]{0}, new Integer[]{0}),
                Arguments.of(new Integer[]{9, 9, 9, 9, 9, 9, 9}, new Integer[]{9, 9, 9, 9}, new Integer[]{8, 9, 9, 9, 0, 0, 0, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] l1Values, Integer[] l2Values, Integer[] expectedValues) {
        ListNode l1 = create(l1Values);
        ListNode l2 = create(l2Values);
        ListNode expected = create(expectedValues);

        ListNode result = s.addTwoNumbers(l1, l2);
        while (expected != null && result != null) {
            Assertions.assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
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
