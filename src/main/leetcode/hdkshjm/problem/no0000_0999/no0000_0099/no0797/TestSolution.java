package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0797;

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
                Arguments.of(new int[][]{{1, 2}, {3}, {3}, {}}, Arrays.asList(Arrays.asList(0, 1, 3), Arrays.asList(0, 2, 3))),
                Arguments.of(new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}}, Arrays.asList(Arrays.asList(0, 4), Arrays.asList(0, 3, 4), Arrays.asList(0, 1, 3, 4), Arrays.asList(0, 1, 2, 3, 4), Arrays.asList(0, 1, 4))),
                Arguments.of(new int[][]{{1}, {}}, Arrays.asList(Arrays.asList(0, 1))),
                Arguments.of(new int[][]{{1, 2, 3}, {2}, {3}, {}}, Arrays.asList(Arrays.asList(0, 1, 2, 3), Arrays.asList(0, 2, 3), Arrays.asList(0, 3))),
                Arguments.of(new int[][]{{1, 3}, {2}, {3}, {}}, Arrays.asList(Arrays.asList(0, 1, 2, 3), Arrays.asList(0, 3))),
                Arguments.of(new int[][]{{2}, {2}, {}}, Arrays.asList(Arrays.asList(0, 2)))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] graph, List<List<Integer>> expected) {
        List<List<Integer>> actual = solution.allPathsSourceTarget(graph);
        Assertions.assertEquals(expected, actual);
    }
}
