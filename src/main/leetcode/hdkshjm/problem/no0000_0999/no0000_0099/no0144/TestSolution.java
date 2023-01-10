package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0144;


import leetcode.hdkshjm.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{1, null, 2, 3}, Arrays.asList(1, 2, 3)),
                Arguments.of(new Integer[]{}, Arrays.asList()),
                Arguments.of(new Integer[]{1}, Arrays.asList(1)),
                Arguments.of(new Integer[]{1, 4, 3, 2}, Arrays.asList(1, 4, 2, 3))
        );
    }


    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, List<Integer> expected) {
        TreeNode node = TreeNode.create(values);
        List<Integer> actual = solution.preorderTraversal(node);
        Assertions.assertEquals(expected, actual);
    }
}
