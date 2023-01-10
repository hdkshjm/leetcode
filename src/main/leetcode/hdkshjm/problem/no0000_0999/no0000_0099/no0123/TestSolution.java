package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0123;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(new int[]{3, 3, 5, 0, 0, 3, 1, 4}, 6),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0),
                Arguments.of(new int[]{6, 1, 3, 2, 4, 7}, 7)
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] prices, int expected) {
        Solution s = new Solution();
        int actual = s.maxProfit(prices);
        Assertions.assertEquals(expected, actual);
    }
}
