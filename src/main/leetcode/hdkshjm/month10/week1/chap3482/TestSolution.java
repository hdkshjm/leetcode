package leetcode.hdkshjm.month10.week1.chap3482;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSolution {

    Solution s = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{3, 1, 4, 1, 5}, 2, 2),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 1, 4),
                Arguments.of(new int[]{1, 3, 1, 5, 4}, 0, 1),
                Arguments.of(new int[]{1, 2, 4, 4, 3, 3, 0, 9, 2, 3}, 3, 2),
                Arguments.of(new int[]{-1, -2, -3}, 1, 2),
                Arguments.of(new int[]{1, 1, 1, 2, 2}, 0, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int k, int expected) {
        int result = s.findPairs(nums, k);
        Assertions.assertEquals(expected, result);
    }
}
