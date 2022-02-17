package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0039;


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
                Arguments.of(new int[]{2, 3, 6, 7}, 7, Arrays.asList(Arrays.asList(2, 2, 3), Arrays.asList(7))),
                Arguments.of(new int[]{2, 3, 5}, 8, Arrays.asList(Arrays.asList(2, 2, 2, 2), Arrays.asList(2, 3, 3), Arrays.asList(3, 5))),
                Arguments.of(new int[]{2}, 1, Arrays.asList()),
                Arguments.of(new int[]{1}, 2, Arrays.asList(Arrays.asList(1, 1)))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] candidates, int target, List<List<Integer>> expected) {
        List<List<Integer>> actual = solution.combinationSum(candidates, target);
        Assertions.assertEquals(expected, actual);
    }
}
