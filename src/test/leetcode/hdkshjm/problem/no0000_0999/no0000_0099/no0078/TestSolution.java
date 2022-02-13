package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0078;

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
                Arguments.of(new int[]{1, 2, 3},
                        Arrays.asList(Arrays.asList(), Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList(1, 2), Arrays.asList(1, 3), Arrays.asList(2, 3), Arrays.asList(1, 2, 3))),
                Arguments.of(new int[]{0},
                        Arrays.asList(Arrays.asList(), Arrays.asList(0)))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, List<List<Integer>> expected) {
        List<List<Integer>> actual = solution.subsets(nums);
        Collections.sort(actual, (o1, o2) -> o1.size()- o2.size());
        Assertions.assertEquals(expected, actual);
    }
}
