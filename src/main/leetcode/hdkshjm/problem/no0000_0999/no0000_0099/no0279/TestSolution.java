package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0279;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(12, 3),
                Arguments.of(13, 2)
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int num, int expected) {
        Solution s = new Solution();
        int actual = s.numSquares(num);
        Assertions.assertEquals(expected, actual);
    }
}
