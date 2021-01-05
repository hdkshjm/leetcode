package leetcode.hdkshjm.challenge.year2020.month10.week1.chap3481;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSolution {

    Solution s = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[] { 2, 3, 6, 7 }, 7, new Integer[][] { { 2, 2, 3 }, { 7 } })
                );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] candidates, int target, Integer[][] expected) {
        List<List<Integer>> results = s.combinationSum(candidates, target);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertTrue(results.contains(Arrays.asList(expected[i])));
        }
    }
}
