package leetcode.hdkshjm.challenge.month10.week4.chap3505;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, false),
                Arguments.of(new int[]{3, 1, 4, 2}, true),
                Arguments.of(new int[]{-1, 3, 2, 0}, true),
                Arguments.of(new int[]{3, 5, 0, 3, 4}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, boolean expected) {
        boolean actual = solution.find132pattern(nums);
        Assertions.assertEquals(expected, actual);
    }
}
