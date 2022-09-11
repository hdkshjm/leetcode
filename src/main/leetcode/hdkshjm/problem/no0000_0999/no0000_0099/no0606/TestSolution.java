package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0606;

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
                Arguments.of(new Integer[]{1,2,3,4}, "1(2(4))(3)"),
                Arguments.of(new Integer[]{1,2,3,null,4}, "1(2()(4))(3)")
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, String expected) {
        TreeNode root = TreeNode.create(values);
        String actual = solution.tree2str(root);
        Assertions.assertEquals(expected, actual);
    }
}
