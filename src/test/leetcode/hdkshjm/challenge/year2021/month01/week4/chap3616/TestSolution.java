package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3616;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 0, 0, 1, 0, 0, 1}, 2, true),
                Arguments.of(new int[]{1, 0, 0, 1, 0, 1}, 2, false),
                Arguments.of(new int[]{1, 1, 1, 1, 1}, 0, true),
                Arguments.of(new int[]{0, 1, 0, 1}, 1, true)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int k, boolean expected) {
        boolean actual = solution.kLengthApart(nums, k);
        Assertions.assertEquals(expected, actual);
    }
}
