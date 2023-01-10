package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0461;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(1, 4, 2),
                Arguments.of(3, 1, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int x, int y, int expected) {
        int actual = solution.hammingDistance(x, y);
        Assertions.assertEquals(expected, actual);
    }
}
