
package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0143;


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
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 4, 2, 3}),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{1, 5, 2, 4, 3})
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] values, int[] expectedvalues) {
        ListNode actual = new ListNode(values);
        s.reorderList(actual);
        ListNode expected = new ListNode(expectedvalues);
        while (expected != null) {
            Assertions.assertEquals(expected.val, actual.val);
            actual = actual.next;
            expected = expected.next;
        }
    }
}
