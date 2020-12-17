package leetcode.hdkshjm.challenge.month12.week3.chap3569;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2}, 2),
                Arguments.of(new int[]{1}, new int[]{1}, new int[]{1}, new int[]{1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] A, int[] B, int[] C, int[] D, int expected) {
        int actual = solution.fourSumCount(A, B, C, D);
        Assertions.assertEquals(expected, actual);
    }
}
