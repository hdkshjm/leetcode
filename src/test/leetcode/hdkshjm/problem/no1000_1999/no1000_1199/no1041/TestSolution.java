package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1041;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("GGLLGG", true),
                Arguments.of("GG", false),
                Arguments.of("GL", true),
                Arguments.of("RLLGGLRGLGLLLGRLRLRLRRRRLRLGRLLLGGL", true)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String instructions, boolean expected) {
        boolean actual = solution.isRobotBounded(instructions);
        Assertions.assertEquals(expected, actual);
    }
}
