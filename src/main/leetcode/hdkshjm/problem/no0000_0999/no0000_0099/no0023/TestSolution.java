package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0023;

import leetcode.hdkshjm.common.ListNode;
import leetcode.hdkshjm.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 4, 5}, {1, 3, 4}, {2, 6}}, new int[]{1, 1, 2, 3, 4, 4, 5, 6}),
                Arguments.of(new int[][]{}, new int[]{}),
                Arguments.of(new int[][]{{}}, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] listValues, int[] expectedValues) {
        ListNode expected = new ListNode(expectedValues);
        ListNode[] lists = new ListNode[listValues.length];
        for (int i = 0; i < lists.length; i++) lists[i] = ListNode.create(listValues[i]);

        ListNode actual = solution.mergeKLists(lists);
        if (lists.length == 0 || expectedValues.length == 0) Assertions.assertNull(actual);
        else ListNode.assertEquals(expected, actual);
    }
}
