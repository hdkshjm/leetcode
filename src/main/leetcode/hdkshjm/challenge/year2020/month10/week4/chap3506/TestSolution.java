package leetcode.hdkshjm.challenge.year2020.month10.week4.chap3506;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{100}, 50, 0),
                Arguments.of(new int[]{100, 200}, 150, 1),
                Arguments.of(new int[]{100, 200, 300, 400}, 200, 2),
                Arguments.of(new int[]{71, 55, 82}, 54, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] tokens, int P, int expected) {
        int actual = solution.bagOfTokensScore(tokens, P);
        Assertions.assertEquals(expected, actual);
    }
}
