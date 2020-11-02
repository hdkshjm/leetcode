package leetcode.hdkshjm.challenge.month11.week1.chap3517;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{4, 2, 1, 3}, new Integer[]{1, 2, 3, 4}),
                Arguments.of(new Integer[]{-1, 5, 3, 4, 0}, new Integer[]{-1, 0, 3, 4, 5}),
                Arguments.of(new Integer[]{2, 2, 1, 1}, new Integer[]{1, 1, 2, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, Integer[] expectedValues) {
        ListNode node = create(values);
        ListNode actual = solution.insertionSortList(node);
        ListNode expected = create(expectedValues);



        while (expected != null && actual != null) {
            System.out.println(String.format("expected=%d, actual=%d", expected.val, actual.val));
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
