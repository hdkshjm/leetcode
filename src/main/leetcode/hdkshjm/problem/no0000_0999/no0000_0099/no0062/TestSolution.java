package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0062;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(3, 7, 28)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int m, int n, int expected) {
        int actual = solution.uniquePaths(m, n);
        Assertions.assertEquals(expected, actual);
    }
}
