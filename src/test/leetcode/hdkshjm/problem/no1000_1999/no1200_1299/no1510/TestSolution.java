package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1510;

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
                Arguments.of(7, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void testMinRemoveToMakeValid(int n, boolean expected) {
        boolean actual = solution.winnerSquareGame(n);
        Assertions.assertEquals(expected, actual);
    }
}
