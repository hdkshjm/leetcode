package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0525;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{0, 1}, 2),
                Arguments.of(new int[]{0, 1, 0}, 2),
                Arguments.of(new int[]{0, 1, 0, 1}, 4),
                Arguments.of(new int[]{1, 1, 1, 1, 0, 0, 0}, 6),
                Arguments.of(new int[]{1, 1, 1, 1, 1, 0, 1, 1, 0, 0}, 6),
                Arguments.of(new int[]{0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0}, 4),
                Arguments.of(new int[]{0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0}, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int expected) {
        int actual = solution.findMaxLength(nums);
        Assertions.assertEquals(expected, actual);
    }
}
