package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0310;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(4, new int[][]{{1, 0}, {1, 2}, {1, 3}}, Arrays.asList(1)),
                Arguments.of(6, new int[][]{{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}}, Arrays.asList(3, 4)),
                Arguments.of(2, new int[][]{{0, 1}}, Arrays.asList(0, 1)),
                Arguments.of(1, new int[][]{{}}, Arrays.asList(0))
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int n, int[][] edges, List<Integer> expected) {
        Solution s = new Solution();
        List<Integer> actual = s.findMinHeightTrees(n, edges);
        Assertions.assertEquals(expected.size(), actual.size());
        for (int i : expected) Assertions.assertTrue(actual.contains(i));
    }
}
