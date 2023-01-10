package leetcode.hdkshjm.problem.no1000_1999.no1663;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(3, 27, "aay"),
                Arguments.of(5, 73, "aaszz"),
                Arguments.of(5, 130, "zzzzz"),
                Arguments.of(2, 18, "aq")
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int n, int k, String expected) {
        String actual = solution.getSmallestString(n, k);
        Assertions.assertEquals(expected, actual);
    }
}
