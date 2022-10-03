package leetcode.hdkshjm.problem.no1000_1999.no1721;

import leetcode.hdkshjm.common.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 2, new int[]{1, 4, 3, 2, 5}),
                Arguments.of(new int[]{7, 9, 6, 6, 7, 8, 3, 0, 9, 5}, 5, new int[]{7, 9, 6, 6, 8, 7, 3, 0, 9, 5}),
                Arguments.of(new int[]{100, 90}, 2, new int[]{90, 100}),
                Arguments.of(new int[]{1, 2}, 1, new int[]{2, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] values, int k, int[] expectedValues) {
        ListNode head = new ListNode(values);
        ListNode expected = new ListNode(expectedValues);
        ListNode actual = solution.swapNodes(head, k);
        ListNode.assertEquals(expected, actual);
    }
}
