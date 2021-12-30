package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1015;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, -1),
                Arguments.of(3, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int k, int expected) {
        int actual = solution.smallestRepunitDivByK(k);
        Assertions.assertEquals(expected, actual);
    }
}
