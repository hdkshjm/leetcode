package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0081;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 5, 6, 0, 0, 1, 2}, 0, true),
                Arguments.of(new int[]{2, 5, 6, 0, 0, 1, 2}, 3, false),
                Arguments.of(new int[]{2, 2, 2, 3, 2, 2, 2}, 3, true),
                Arguments.of(new int[]{2, 2, 2, 2, 2, 2, 3}, 3, true),
                Arguments.of(new int[]{3, 2, 2, 2, 2, 2, 2}, 3, true)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int target, boolean expected) {
        boolean actual = solution.search(nums, target);
        Assertions.assertEquals(expected, actual);
    }
}
