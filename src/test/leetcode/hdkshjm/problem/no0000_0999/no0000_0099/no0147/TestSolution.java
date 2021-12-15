package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0147;


import leetcode.hdkshjm.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution s = new Solution();

    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(new int[]{-1, 5, 3, 4, 0}, new int[]{-1, 0, 3, 4, 5})
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] values, int[] expectedvalues) {
        ListNode head = new ListNode(values);
        ListNode actual = s.insertionSortList(head);
        ListNode expected = new ListNode(expectedvalues);
        while (expected != null) {
            Assertions.assertEquals(expected.val, actual.val);
            actual = actual.next;
            expected = expected.next;
        }
    }
}
