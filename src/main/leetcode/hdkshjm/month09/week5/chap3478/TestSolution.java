package leetcode.hdkshjm.month09.week5.chap3478;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[] { 1, 2, 0 }, 3),
                Arguments.of(new int[] { 3, 4, -1, 1 }, 2),
                Arguments.of(new int[] { 7, 8, 9, 11, 12 }, 1)
                );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void firstMissingPositive(int[] nums, int expected) {
        int result = solution.firstMissingPositive(nums);
        Assertions.assertEquals(expected, result);

    }
}
