package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0174;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}}, 7),
                Arguments.of(new int[][]{{0}}, 1),
                Arguments.of(new int[][]{{1, -3, 3}, {0, -2, 0}, {-3, -3, -3}}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void twoSum(int[][] dungeon, int expected) {
        int result = solution.calculateMinimumHP(dungeon);
        Assertions.assertEquals(expected, result);
    }
}
