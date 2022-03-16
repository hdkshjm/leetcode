package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0946;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}, true),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] pushed, int[] popped, boolean expected) {
        boolean actual = solution.validateStackSequences(pushed, popped);
        Assertions.assertEquals(expected, actual);
    }
}
