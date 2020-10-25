package leetcode.hdkshjm.challenge.month10.week4.chap3507;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(1, true),
                Arguments.of(2, false),
                Arguments.of(4, true),
                Arguments.of(7, false),
                Arguments.of(17, false),
                Arguments.of(8, true)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int n, boolean expected) {
        boolean actual = solution.winnerSquareGame(n);
        Assertions.assertEquals(expected, actual);
    }
}
