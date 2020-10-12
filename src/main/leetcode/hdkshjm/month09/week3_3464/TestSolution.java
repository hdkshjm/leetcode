package leetcode.hdkshjm.month09.week3_3464;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                 Arguments.of(new int[] { 7, 1, 5, 3, 6, 4 }, 5),
                 Arguments.of(new int[] {7,6,4,3,1}, 0),
                 Arguments.of(new int[] { 1, 2 }, 1),
                Arguments.of(new int[] { 1, 2, 3, 3 }, 2)

                );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void maxProfit(int[] prices, int expected) {
        int result = solution.maxProfit(prices);
        Assertions.assertEquals(expected, result);

    }
}
