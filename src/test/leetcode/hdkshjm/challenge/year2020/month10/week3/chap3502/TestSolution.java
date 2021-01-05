package leetcode.hdkshjm.challenge.year2020.month10.week3.chap3502;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{5,10,-5}, new int[]{5,10}),
                Arguments.of(new int[]{8,-8}, new int[]{}),
                Arguments.of(new int[]{10,2,-5}, new int[]{10}),
                Arguments.of(new int[]{-2,-1,1,2}, new int[]{-2,-1,1,2}),
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{-2,-2,1,-2}, new int[]{-2,-2,-2})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] asteroids, int[] expected) {
        int[] actual = solution.asteroidCollision(asteroids);
        Assertions.assertArrayEquals(expected, actual);
    }
}
