package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0441;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(5, 2),
                Arguments.of(8, 3),
                Arguments.of(1, 1),
                Arguments.of(7, 3),
                Arguments.of(2146467960, 65520)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int n, int expected) {
        int actual = solution.arrangeCoins(n);
        Assertions.assertEquals(expected, actual);
    }
}
