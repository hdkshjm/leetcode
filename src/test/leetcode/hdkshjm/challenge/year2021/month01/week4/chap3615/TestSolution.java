package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3615;

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
    void test(int[][] values, int[] expectedValues) {
        ListNode[] nodes = new ListNode[values.length];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                nodes[i] = new ListNode(values[i][values[i].length - 1 - j], nodes[i]);
            }
        }

        ListNode expected = null;
        for (int i = 0; i < expectedValues.length; i++) {
            expected = new ListNode(expectedValues[expectedValues.length - 1 - i], expected);
        }

        ListNode actual = solution.mergeKLists(nodes);
        for (int i = 0; i < expectedValues.length; i++) {
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }
}
