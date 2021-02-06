package leetcode.hdkshjm.challenge.year2021.month02.week1.chap3628;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 2, 2, 5, 2, 3, 7}, 5),
                Arguments.of(new int[]{1, 2, 3, 4}, 2),
                Arguments.of(new int[]{1, 1, 1, 1}, 0),
                Arguments.of(new int[]{1, 2, 2, 1}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int expected) {
        int actual = solution.findLHS(nums);
        Assertions.assertEquals(expected, actual);
    }
}
