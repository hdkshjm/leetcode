package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0337;

import leetcode.hdkshjm.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
Solution solution = new  Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{3,2,3,null,3,null,1}, 7),
                Arguments.of(new Integer[]{3,4,5,1,3,null,1}, 9 )
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(Integer[] values, int expected) {
        TreeNode root = TreeNode.create(values);
        int actual = solution.rob(root);
        Assertions.assertEquals(expected, actual);
    }
}
