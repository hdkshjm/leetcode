package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3618;

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
                Arguments.of(3, 27),
                Arguments.of(12, 505379714)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int n, int expected) {
        int actual = solution.concatenatedBinary(n);
        Assertions.assertEquals(expected, actual);
    }
}
