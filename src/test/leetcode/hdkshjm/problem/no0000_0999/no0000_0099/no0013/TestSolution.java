package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0013;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("MCMXCIV", 1994)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, int expected) {
        int result = solution.romanToInt(s);
        Assertions.assertEquals(expected, result);
    }
}
