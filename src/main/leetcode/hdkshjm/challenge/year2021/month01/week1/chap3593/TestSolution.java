package leetcode.hdkshjm.challenge.year2021.month01.week1.chap3593;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {

    Solution s = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3, 3, 4, 4, 5}, new Integer[]{1, 2, 5}),
                Arguments.of(new Integer[]{1, 1, 1, 2, 3}, new Integer[]{2, 3}),
                Arguments.of(new Integer[]{1, 2, 2}, new Integer[]{1})
        );
    }

    static Stream<Arguments> emptyProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 1}, null)
        );
    }


    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, Integer[] expectedValues) {
        ListNode node = null;
        for (int i = 0; i < values.length; i++) {
            node = new ListNode(values[values.length - 1 - i], node);
        }

        ListNode expected = null;
        for (int i = 0; i < expectedValues.length; i++) {
            expected = new ListNode(expectedValues[expectedValues.length - 1 - i], expected);
        }

        ListNode actual = s.deleteDuplicates(node);

        for (int i = 0; i < expectedValues.length; i++) {
            Assertions.assertNotNull(actual);
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @ParameterizedTest
    @MethodSource("emptyProvider")
    void testEmpty(Integer[] values, ListNode expected) {
        ListNode node = null;
        for (int i = 0; i < values.length; i++) {
            node = new ListNode(values[values.length - 1 - i], node);
        }

        ListNode actual = s.deleteDuplicates(node);
        Assertions.assertEquals(expected, actual);
    }
}
