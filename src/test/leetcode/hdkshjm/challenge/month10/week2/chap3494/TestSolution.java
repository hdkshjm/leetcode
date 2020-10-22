package leetcode.hdkshjm.challenge.month10.week2.chap3494;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 2}, 3),
                Arguments.of(new int[]{1, 2, 3, 1}, 4),
                Arguments.of(new int[]{1, 1, 1}, 1),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{2, 1, 1, 2}, 3),
                Arguments.of(new int[]{1, 1, 1, 2}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int expected) {
        Assertions.assertEquals(expected, solution.rob(nums));
    }
}