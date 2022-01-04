package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0997;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(2, new int[][]{{1, 2}}, 2),
                Arguments.of(3, new int[][]{{1, 3}, {2, 3}}, 3),
                Arguments.of(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int n, int[][] trust, int expected) {
        int actual = solution.findJudge(n, trust);
        Assertions.assertEquals(expected, actual);
    }
}
