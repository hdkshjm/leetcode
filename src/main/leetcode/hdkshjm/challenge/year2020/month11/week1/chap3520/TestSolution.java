package leetcode.hdkshjm.challenge.year2020.month11.week1.chap3520;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 1),
                Arguments.of(new int[]{2, 2, 2, 3, 3}, 2),
                Arguments.of(new int[]{1, 1000000000}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] potsition, int expected) {
        int actual = solution.minCostToMoveChips(potsition);
        Assertions.assertEquals(expected, actual);
    }
}
