package leetcode.hdkshjm.challenge.year2021.month02.week2.chap3637;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(14, 6),
                Arguments.of(8, 4),
                Arguments.of(123, 12)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int num, int expected) {
        int actual = solution.numberOfSteps(num);
        Assertions.assertEquals(expected, actual);
    }
}
