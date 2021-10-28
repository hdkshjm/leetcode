package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0015;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1))),
                Arguments.of(new int[]{}, Arrays.asList()),
                Arguments.of(new int[]{0}, Arrays.asList()),
                Arguments.of(new int[]{0, 0, 0}, Arrays.asList(Arrays.asList(0, 0, 0)))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, List<List<Integer>> expected) {
        List<List<Integer>> result = solution.threeSum(nums);
        Assertions.assertEquals(expected, result);
    }
}
