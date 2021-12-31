package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1026;


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
                Arguments.of(new Integer[]{8, 3, 10, 1, 6, null, 14, null, null, 4, 7, 13}, 7),
                Arguments.of(new Integer[]{1, null, 2, null, 0, 3}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int expected) {
        TreeNode root = TreeNode.create(values);
        int actual = solution.maxAncestorDiff(root);
        Assertions.assertEquals(expected, actual);
    }
}
