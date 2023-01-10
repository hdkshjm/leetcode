package leetcode.hdkshjm.challenge.year2020.month10.week2.chap3493;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {

    Solution s = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{-1, 5, 3, 4, 0}, new Integer[]{-1, 0, 3, 4, 5}),
                Arguments.of(new Integer[]{}, new Integer[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] nodeVals, Integer[] expectedNodeVals) {

        ListNode node = null;
        for (int i = 0; i < nodeVals.length; i++) {
            node = new ListNode(nodeVals[nodeVals.length - 1 - i], node);
        }

        ListNode expectedNode = null;
        for (int i = 0; i < expectedNodeVals.length; i++) {
            expectedNode = new ListNode(expectedNodeVals[expectedNodeVals.length - 1 - i], expectedNode);
        }

        ListNode result = s.sortList(node);

        if (expectedNode != null) {
            while (result.next != null) {
                Assertions.assertEquals(expectedNode.val, result.val);
                expectedNode = expectedNode.next;
                result = result.next;
            }
            Assertions.assertEquals(null, result.next);
        } else {
            Assertions.assertEquals(expectedNode, result);
        }
    }
}