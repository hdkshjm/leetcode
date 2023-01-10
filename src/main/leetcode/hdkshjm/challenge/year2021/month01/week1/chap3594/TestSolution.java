package leetcode.hdkshjm.challenge.year2021.month01.week1.chap3594;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 4, 7, 11}, 5, 9),
                Arguments.of(new int[]{1, 2, 3, 4}, 2, 6),
                Arguments.of(new int[]{1, 2}, 1, 3)

        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] arr, int k, int expected) {
        int actual = solution.findKthPositive(arr, k);
        Assertions.assertEquals(expected, actual);
    }
}
