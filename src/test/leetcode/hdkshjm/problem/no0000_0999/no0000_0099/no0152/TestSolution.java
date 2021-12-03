package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0152;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, -2, 4}, 6),
                Arguments.of(new int[]{-2, 0, -1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int expected) {
        int result = solution.maxProduct(nums);
        Assertions.assertEquals(expected, result);
    }
}
