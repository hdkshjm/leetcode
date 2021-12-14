package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0938;

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
                Arguments.of(new Integer[]{10, 5, 15, 3, 7, null, 18}, 7, 15, 32)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int low, int high, int expected) {
        TreeNode root = TreeNode.create(values);
        int actual = solution.rangeSumBST(root, low, high);
        Assertions.assertEquals(expected, actual);
    }
}
