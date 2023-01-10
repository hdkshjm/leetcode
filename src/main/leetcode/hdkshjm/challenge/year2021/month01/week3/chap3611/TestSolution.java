package leetcode.hdkshjm.challenge.year2021.month01.week3.chap3611;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 2, 6}, 2, new int[]{2, 6}),
                Arguments.of(new int[]{2, 4, 3, 3, 5, 4, 9, 6}, 4, new int[]{2, 3, 3, 4}),
                Arguments.of(new int[]{71, 18, 52, 29, 55, 73, 24, 42, 66, 8, 80, 2}, 3, new int[]{8, 80, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int k, int[] expected) {
        int[] actual = solution.mostCompetitive(nums, k);
        Assertions.assertArrayEquals(expected, actual);
    }
}
