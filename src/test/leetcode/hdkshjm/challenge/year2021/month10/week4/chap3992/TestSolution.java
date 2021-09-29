package leetcode.hdkshjm.challenge.year2021.month10.week4.chap3992;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {

    Solution s = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3}, 5, new Integer[][]{{1}, {2}, {3}, {}, {}}),
                Arguments.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3, new Integer[][]{{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10}})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int k, Integer[][] expectedValues) {
        ListNode node = null;
        for (int i = 0; i < values.length; i++) {
            node = new ListNode(values[values.length - 1 - i], node);
        }

        ListNode[] expected = new ListNode[expectedValues.length];
        for (int i = 0; i < expectedValues.length; i++) {
            for (int j = 0; j < expectedValues[i].length; j++) {
                expected[i] = new ListNode(expectedValues[i][expectedValues[i].length - 1 - j], expected[i]);
            }
        }

        ListNode[] actual = s.splitListToParts(node, k);

        for (int i = 0; i < expectedValues.length; i++) {
            for (int j = 0; j < expectedValues[i].length; j++) {
                Assertions.assertNotNull(actual);
                Assertions.assertEquals(expected[i].val, actual[i].val);
                expected[i] = expected[i].next;
                actual[i] = actual[i].next;
            }
        }
    }
}
