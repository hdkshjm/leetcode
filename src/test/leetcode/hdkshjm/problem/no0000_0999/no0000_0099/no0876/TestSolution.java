package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0876;

import leetcode.hdkshjm.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, 3),
                Arguments.of(new int[]{1,2,3,4,5,6}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] values, int expected) {
        ListNode head = new ListNode(values);
        ListNode actual = solution.middleNode(head);
        Assertions.assertEquals(expected, actual.val);
    }
}
