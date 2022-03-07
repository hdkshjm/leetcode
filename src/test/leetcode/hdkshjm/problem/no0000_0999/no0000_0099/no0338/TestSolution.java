package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0338;

import leetcode.hdkshjm.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(2, new int[]{0, 1, 1}),
                Arguments.of(5, new int[]{0, 1, 1, 2, 1, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int n, int[] expected) {
        int[] actual = solution.countBits(n);
        Assertions.assertArrayEquals(expected, actual);
    }
}
