package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0952;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 6, 15, 35}, 4),
                Arguments.of(new int[]{20, 50, 9, 63}, 2),
                Arguments.of(new int[]{2, 3, 6, 7, 4, 12, 21, 39}, 8),
                Arguments.of(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19}, 14)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int expected) {
        int actual = solution.largestComponentSize(nums);
        Assertions.assertEquals(expected, actual);
    }
}
