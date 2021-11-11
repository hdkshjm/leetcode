package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1413;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{-3, 2, -3, 4, 2}, 5),
                Arguments.of(new int[]{1, 2}, 1),
                Arguments.of(new int[]{1, -2, -3}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void testMinRemoveToMakeValid(int[] nums, int expected) {
        int result = solution.minStartValue(nums);
        Assertions.assertEquals(expected, result);
    }
}
