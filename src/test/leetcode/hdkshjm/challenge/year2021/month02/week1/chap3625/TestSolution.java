package leetcode.hdkshjm.challenge.year2021.month02.week1.chap3625;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(11, 3),
                Arguments.of(128, 1),
                Arguments.of(-3, 31)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int n, int expected) {
        int actual = solution.hammingWeight(n);
        Assertions.assertEquals(expected, actual);
    }
}
