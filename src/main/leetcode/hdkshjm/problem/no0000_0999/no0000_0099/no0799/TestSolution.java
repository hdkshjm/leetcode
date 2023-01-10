package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0799;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(1, 1, 1, 0),
                Arguments.of(2, 1, 1, 0.5),
                Arguments.of(100000009, 33, 17, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int poured, int query_row, int query_glass, double expected) {
        double actual = solution.champagneTower(poured, query_row, query_glass);
        Assertions.assertEquals(expected, actual);
    }
}
