package leetcode.hdkshjm.challenge.year2020.month11.week1.chap3522;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{7, 2, 4, 3}, new Integer[]{5, 6, 4}, new Integer[]{7, 8, 0, 7}));
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] l1Values, Integer[] l2Values, Integer[] expectedValues) {
        ListNode l1 = create(l1Values);
        ListNode l2 = create(l2Values);
        ListNode expected = create(expectedValues);

        ListNode result = solution.addTwoNumbers(l1, l2);
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
