package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0328;

import leetcode.hdkshjm.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{1, 3, 5, 2, 4}),
                Arguments.of(new int[]{2, 1, 3, 5, 6, 4, 7}, new int[]{2, 3, 6, 7, 1, 5, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] values, int[] expectedValues) {
        ListNode head = new ListNode(values);
        ListNode expected = new ListNode(expectedValues);

        ListNode actual = solution.oddEvenList(head);
        ListNode.assertEquals(expected, actual);
    }
}
