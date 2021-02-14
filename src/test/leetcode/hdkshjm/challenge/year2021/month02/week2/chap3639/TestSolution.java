package leetcode.hdkshjm.challenge.year2021.month02.week2.chap3639;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3}, {0, 2}, {1, 3}, {0, 2}}, true),
                Arguments.of(new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] graph, boolean expected) {
        boolean actual = solution.isBipartite(graph);
        Assertions.assertEquals(expected, actual);
    }
}
