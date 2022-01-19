package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0605;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 1, true),
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 2, false),
                Arguments.of(new int[]{0, 0, 0, 1}, 1, true),
                Arguments.of(new int[]{1, 0, 0, 0}, 1, true),
                Arguments.of(new int[]{1, 0, 0, 0, 0, 1}, 2, false),
                Arguments.of(new int[]{1, 0, 1, 0, 1, 0, 1}, 1, false),
                Arguments.of(new int[]{0}, 1, true)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] flowerbed, int n, boolean expected) {
        boolean actual = solution.canPlaceFlowers(flowerbed, n);
        Assertions.assertEquals(expected, actual);
    }
}
