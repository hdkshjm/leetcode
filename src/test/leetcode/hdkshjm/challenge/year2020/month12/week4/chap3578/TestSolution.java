package leetcode.hdkshjm.challenge.year2020.month12.week4.chap3578;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(12, 21),
                Arguments.of(21, -1),
                Arguments.of(132, 213),
                Arguments.of(1234, 1243),
                Arguments.of(1999999999, 1999999999)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int n, int expected) {
        System.out.println("n:  " + n);
        int actual = solution.nextGreaterElement(n);
        Assertions.assertEquals(expected, actual);
    }
}
