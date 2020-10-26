package leetcode.hdkshjm.challenge.month10.week4.chap3508;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(1, 1, 1, 0),
                Arguments.of(2, 1, 1, 0.5),
                Arguments.of(2, 0, 0, 1),
                Arguments.of(15, 1, 1, 1),
                Arguments.of(100000009, 33, 17, 1),
                Arguments.of(25, 6, 1, 0.18750)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int poured, int query_row, int query_glass, double expected) {
        double actual = solution.champagneTower(poured, query_row, query_glass);
        Assertions.assertEquals(expected, actual);
    }
}
