package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0075;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 0, 2, 1, 1, 0}, new int[]{0, 0, 1, 1, 2, 2}),
                Arguments.of(new int[]{2, 0, 1}, new int[]{0, 1, 2}),
                Arguments.of(new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{1}, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int[] expected) {
        solution.sortColors(nums);
        Assertions.assertArrayEquals(expected, nums);
    }
}
