package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0402;

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
                Arguments.of("1432219", 3, "1219"),
                Arguments.of("10200", 1, "200"),
                Arguments.of("10", 2, "0"),
                Arguments.of("1234567890", 9, "0"),
                Arguments.of("112", 1, "11")
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String num, int k, String expected) {
        String actual = solution.removeKdigits(num, k);
        Assertions.assertEquals(expected, actual);
    }
}
