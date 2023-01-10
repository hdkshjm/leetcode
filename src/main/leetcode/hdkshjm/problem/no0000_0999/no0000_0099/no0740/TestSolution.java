package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0740;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 2}, 6),
                Arguments.of(new int[]{2, 2, 3, 3, 3, 4}, 9),
                Arguments.of(new int[]{8, 10, 4, 9, 1, 3, 5, 9, 4, 10}, 37),
                Arguments.of(new int[]{8, 3, 4, 7, 6, 6, 9, 2, 5, 8, 2, 4, 9, 5, 9, 1, 5, 7, 1, 4}, 61),
                Arguments.of(new int[]{3, 7, 10, 5, 2, 4, 8, 9, 9, 4, 9, 2, 6, 4, 6, 5, 4, 7, 6, 10}, 66),
                Arguments.of(new int[]{6, 5, 10, 2, 8, 6, 6, 5, 2, 9, 9, 4, 6, 3, 3, 7, 7, 8, 9, 5}, 62)

        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int expected) {
        int actual = solution.deleteAndEarn(nums);
        Assertions.assertEquals(expected, actual);
    }
}
