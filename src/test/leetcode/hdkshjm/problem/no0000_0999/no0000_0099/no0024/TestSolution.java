package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0024;

import leetcode.hdkshjm.common.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{2, 1, 4, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] values, int[] expectedValues) {
        ListNode expected = new ListNode(expectedValues);
        ListNode head = new ListNode(values);
        ListNode actual = solution.swapPairs(head);
        ListNode.assertEquals(expected, actual);
        ListNode node = actual;
    }
}
