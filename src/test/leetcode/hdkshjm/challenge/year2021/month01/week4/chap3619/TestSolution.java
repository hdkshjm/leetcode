package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3619;

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
                Arguments.of(5, 73, "aaszz")
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int n, int k, String expected) {
        String actual = solution.getSmallestString(n, k);
        Assertions.assertEquals(expected, actual);
    }
}
