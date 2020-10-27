package leetcode.hdkshjm.challenge.month10.week4.chap3509;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {

    Solution s = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, 0),
                Arguments.of(new int[]{3, 2, 0, -4}, -1),
                Arguments.of(new int[]{1}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nodeVals, int expectedIndex) {
        ListNode node = null;
        ListNode lastNode = null;
        ListNode expectedNode = null;
        for (int i = 0; i < nodeVals.length; i++) {
            int index = nodeVals.length - 1 - i;
            ListNode newNode = new ListNode(nodeVals[index]);
            if (i == 0) {
                lastNode = newNode;
            }
            if (index == expectedIndex) {
                expectedNode = newNode;
            }
            newNode.next = node;
            node = newNode;
        }
        lastNode.next = expectedNode;

        ListNode result = s.detectCycle(node);
        if (expectedNode == null) {
            Assertions.assertEquals(expectedNode, result);
        } else {
            Assertions.assertEquals(expectedNode.val, result.val);
        }
    }
}
