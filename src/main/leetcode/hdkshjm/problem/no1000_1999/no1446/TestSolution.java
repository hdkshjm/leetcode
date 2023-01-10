package leetcode.hdkshjm.problem.no1000_1999.no1446;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("leetcode", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void testMinRemoveToMakeValid(String s, int expected) {
        int actual = solution.maxPower(s);
        Assertions.assertEquals(expected, actual);
    }
}
