package leetcode.hdkshjm.challenge.year2021.month02.week3.chap3643;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1),
                Arguments.of(new int[]{4, 3, 2, 1, 4}, 16),
                Arguments.of(new int[]{1, 2, 1}, 2),
                Arguments.of(new int[]{2, 3, 4, 5, 18, 17, 6}, 17),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 25, 24, 3, 4}, 24),
                Arguments.of(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 25)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] height, int expected) {
        int actual = solution.maxArea(height);
        Assertions.assertEquals(expected, actual);
    }
}
