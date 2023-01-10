package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0100;


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
                Arguments.of(new Integer[]{1, 2, 3}, new Integer[]{1, 2, 3}, true),
                Arguments.of(new Integer[]{1, 2}, new Integer[]{1, null, 2}, false),
                Arguments.of(new Integer[]{1, 2, 1}, new Integer[]{1, 1, 2}, false)
        );
    }


    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] pValues, Integer[] qValues, boolean expected) {
        TreeNode p = TreeNode.create(pValues);
        TreeNode q = TreeNode.create(qValues);
        boolean actual = solution.isSameTree(p, q);
        Assertions.assertEquals(expected, actual);
    }
}
