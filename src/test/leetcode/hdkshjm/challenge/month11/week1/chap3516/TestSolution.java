package leetcode.hdkshjm.challenge.month11.week1.chap3516;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 0, 1}, 5),
                Arguments.of(new Integer[]{0}, 0),
                Arguments.of(new Integer[]{1}, 1),
                Arguments.of(new Integer[]{1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0}, 18880),
                Arguments.of(new Integer[]{0, 0}, 0),
                Arguments.of(new Integer[]{1, 0, 1, 1}, 11)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int expected) {
        ListNode node = create(values);
        int actual = solution.getDecimalValue(node);
        Assertions.assertEquals(expected, actual);

    }

    private ListNode create(Integer[] values) {
        ListNode node = null;
        for (int i = 0; i < values.length; i++) {
            node = new ListNode(values[values.length - 1 - i], node);
        }
        return node;
    }
}
