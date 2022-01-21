package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0875;

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
                Arguments.of(new int[]{3, 6, 7, 11}, 8, 4),
                Arguments.of(new int[]{30, 11, 23, 4, 20}, 5, 30),
                Arguments.of(new int[]{30, 11, 23, 4, 20}, 6, 23),
                Arguments.of(new int[]{312884470}, 968709470, 1)

        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] piles, int h, int expected) {
        int actual = solution.minEatingSpeed(piles, h);
        Assertions.assertEquals(expected, actual);
    }
}
