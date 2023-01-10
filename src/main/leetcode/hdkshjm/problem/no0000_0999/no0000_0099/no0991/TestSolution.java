package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0991;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(2,3,2),
                Arguments.of(5,8,2),
                Arguments.of(3,10,3)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int startValue, int target, int expected) {
        int actual = solution.brokenCalc(startValue, target);
        Assertions.assertEquals(expected, actual);
    }
}
