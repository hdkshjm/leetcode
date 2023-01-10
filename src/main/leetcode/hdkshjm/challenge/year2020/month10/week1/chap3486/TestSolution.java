package leetcode.hdkshjm.challenge.year2020.month10.week1.chap3486;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {

    Solution s = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3, 4, 5}, 2, new Integer[]{4, 5, 1, 2, 3}),
                Arguments.of(new Integer[]{0, 1, 2}, 4, new Integer[]{2, 0, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] nodes, int k, Integer[] expectedNodes) {

        ListNode node = null;
        for (int i = 0; i < nodes.length; i++) {
            node = new ListNode(nodes[nodes.length - 1 - i], node);
        }

        ListNode expectedNode = null;
        for (int i = 0; i < expectedNodes.length; i++) {
            expectedNode = new ListNode(expectedNodes[expectedNodes.length - 1 - i], expectedNode);
            System.out.println("expectedNode create val=" + i);
        }

        ListNode result = s.rotateRight(node, k);
        Assertions.assertEquals(expectedNode.val, result.val);
    }
}
