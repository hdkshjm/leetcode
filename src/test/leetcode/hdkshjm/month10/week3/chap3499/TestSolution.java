package leetcode.hdkshjm.month10.week3.chap3499;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(2, new int[]{2, 4, 1}, 2),
                Arguments.of(2, new int[]{3, 2, 6, 5, 0, 3}, 7),
                Arguments.of(4, new int[]{3, 2, 6, 5, 0, 3}, 7),
                Arguments.of(4, new int[]{3, 2, 1, 2, 3}, 2),
                Arguments.of(2, new int[]{1, 2, 4}, 3),
                Arguments.of(2, new int[]{3, 3, 5, 0, 0, 3, 1, 4}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int k, int[] prices, int expected) {
        int actual = solution.maxProfit(k, prices);
        Assertions.assertEquals(expected, actual);
    }
}
