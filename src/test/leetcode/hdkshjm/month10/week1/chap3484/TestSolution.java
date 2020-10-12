package leetcode.hdkshjm.month10.week1.chap3484;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSolution {

    Solution s = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
            Arguments.of(5, 2),
            Arguments.of(7, 0),
            Arguments.of(10, 5),
            Arguments.of(6, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int N, int expected) {
        int result = s.bitwiseComplement(N);
        Assertions.assertEquals(expected, result);
    }
}
