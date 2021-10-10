package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0201;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(5, 7, 4),
                Arguments.of(0, 0, 0),
                Arguments.of(1, 2147483647, 0),
                Arguments.of(3, 3, 3),
                Arguments.of(6, 7, 6),
                Arguments.of(5, 6, 4),
                Arguments.of(2147483646, 2147483647, 2147483646)
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int left, int right, int expected) {
        Solution s = new Solution();
        int actual = s.rangeBitwiseAnd(left, right);
        Assertions.assertEquals(expected, actual);
    }
}
