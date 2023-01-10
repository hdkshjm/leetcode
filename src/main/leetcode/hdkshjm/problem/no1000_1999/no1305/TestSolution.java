package leetcode.hdkshjm.problem.no1000_1999.no1305;

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
                Arguments.of(new Integer[]{2, 1, 4}, new Integer[]{1, 0, 3}, Arrays.asList(0, 1, 1, 2, 3, 4)),
                Arguments.of(new Integer[]{1, null, 8}, new Integer[]{8, 1}, Arrays.asList(1, 1, 8, 8)),
                Arguments.of(new Integer[]{0, -10, 10}, new Integer[]{5, 1, 7, 0, 2}, Arrays.asList(-10, 0, 0, 1, 2, 5, 7, 10)),
                Arguments.of(new Integer[]{10, 4, 15, 1, 5, 12, 17}, new Integer[]{10, 4, 15, 1, 5, 12, 17}, Arrays.asList(1, 1, 4, 4, 5, 5, 10, 10, 12, 12, 15, 15, 17, 17))

        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values1, Integer[] values2, List<Integer> expected) {
        TreeNode root1 = TreeNode.create(values1);
        TreeNode root2 = TreeNode.create(values2);
        List<Integer> result = solution.getAllElements(root1, root2);
        Assertions.assertEquals(expected, result);
    }
}
