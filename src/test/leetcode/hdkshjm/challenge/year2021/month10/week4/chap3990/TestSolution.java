package leetcode.hdkshjm.challenge.year2021.month10.week4.chap3990;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 2, 5, 7}, new int[]{4, 5, 2, 7}),
                Arguments.of(new int[]{2, 3}, new int[]{2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int[] expected) {
        int[] actual = solution.sortArrayByParityII(nums);
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(expected, actual);
    }
}
