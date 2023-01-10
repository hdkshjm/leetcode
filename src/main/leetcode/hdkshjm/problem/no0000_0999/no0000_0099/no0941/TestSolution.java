package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0941;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 1}, false),
                Arguments.of(new int[]{3, 5, 5}, false),
                Arguments.of(new int[]{0, 3, 2, 1}, true),
                Arguments.of(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] arr, boolean expected) {
        boolean actual = solution.validMountainArray(arr);
        Assertions.assertEquals(expected, actual);
    }
}
