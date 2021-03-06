package leetcode.hdkshjm.challenge.year2020.month10.week3.chap3500;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 2, 4, 2, 2}, new int[]{5, 2, 6, 2, 3, 2}, 2),
                Arguments.of(new int[]{3, 5, 1, 2, 3}, new int[]{3, 6, 3, 3, 4}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] A, int[] B, int expected) {
        int actual = solution.minDominoRotations(A, B);
        Assertions.assertEquals(expected, actual);
    }
}
