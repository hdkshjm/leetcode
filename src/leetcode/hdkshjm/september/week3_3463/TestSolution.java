package leetcode.hdkshjm.september.week3_3463;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("GGLLGG", true),
                Arguments.of("GG", false),
                Arguments.of("GL", true),
                Arguments.of("LLGRL", true)
                );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void isRobotBounded(String instructions, boolean expected) {
        boolean result = solution.isRobotBounded(instructions);
        Assertions.assertEquals(expected, result);

    }
}
