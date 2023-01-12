package leetcode.hdkshjm.problem.no1000_1999.no1443;


import leetcode.hdkshjm.common.TreeNode;
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
                Arguments.of(7, new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}}, Arrays.asList(false, false, true, false, true, true, false), 8)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int n, int[][] edges, List<Boolean> hasApple, int expected) {
        int actual = solution.minTime(n, edges, hasApple);
        Assertions.assertEquals(expected, actual);
    }
}
