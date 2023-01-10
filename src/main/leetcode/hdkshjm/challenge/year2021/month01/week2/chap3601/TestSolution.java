package leetcode.hdkshjm.challenge.year2021.month01.week2.chap3601;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 4, 3}, new int[]{5, 6, 4}, new int[]{7, 0, 8}),
                Arguments.of(new int[]{0}, new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9}, new int[]{8, 9, 9, 9, 0, 0, 0, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] l1Values, int[] l2Values, int[] expectedValues) {
        ListNode l1 = null;
        for (int i = 0; i < l1Values.length; i++) {
            l1 = new ListNode(l1Values[l1Values.length - 1 - i], l1);
        }

        ListNode l2 = null;
        for (int i = 0; i < l2Values.length; i++) {
            l2 = new ListNode(l2Values[l2Values.length - 1 - i], l2);
        }

        ListNode expected = null;
        for (int i = 0; i < expectedValues.length; i++) {
            expected = new ListNode(expectedValues[expectedValues.length - 1 - i], expected);
        }

        ListNode actual = solution.addTwoNumbers(l1, l2);
        for (int i = 0; i < expectedValues.length; i++) {
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }
}
