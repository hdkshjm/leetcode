package leetcode.hdkshjm.challenge.year2021.month02.week1.chap3627;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{3, 2, 0, -4}, 1, true),
                Arguments.of(new Integer[]{1, 2}, 0, true),
                Arguments.of(new Integer[]{1}, -1, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int pos, boolean expected) {
        ListNode node = null;
        ListNode posNode = null;
        ListNode lastNode = null;
        for (int i = 0; i < values.length; i++) {
            node = new ListNode(values[values.length - 1 - i], node);
            if (i == pos) posNode = node;
            if (i == 0) lastNode = node;
        }
        lastNode.next = posNode;

        boolean actual = solution.hasCycle(node);
        Assertions.assertEquals(expected, actual);
    }

}
