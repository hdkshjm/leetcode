package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0973;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 3}, {-2, 2}}, 1, new int[][]{{-2, 2}}),
                Arguments.of(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2, new int[][]{{3, 3}, {-2, 4}})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] points, int k, int[][] expected) {
        int[][] actual = solution.kClosest(points, k);
        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) Assertions.assertArrayEquals(expected[i], actual[i]);
    }
}
