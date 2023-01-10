package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0563;

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
                Arguments.of(new Integer[]{1, 2, 3}, 1),
                Arguments.of(new Integer[]{4, 2, 9, 3, 5, null, 7}, 15)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int expected) {
        TreeNode root = TreeNode.create(values);
        int actual = solution.findTilt(root);
        Assertions.assertEquals(expected, actual);
    }
}
