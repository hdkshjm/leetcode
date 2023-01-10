package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0227;

import leetcode.hdkshjm.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("3+2*2", 7),
                Arguments.of(" 3/2 ", 1),
                Arguments.of(" 3+5 / 2 ", 5)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, int expected) {
        int actual = solution.calculate(s);
        Assertions.assertEquals(expected, actual);
    }
}
