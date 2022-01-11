package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1022;


import leetcode.hdkshjm.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 0, 1, 0, 1, 0, 1}, 22),
                Arguments.of(new Integer[]{0}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int expected) {
        TreeNode root = TreeNode.create(values);
        int actual = solution.sumRootToLeaf(root);
        Assertions.assertEquals(expected, actual);
    }
}
