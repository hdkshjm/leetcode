package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0438;

import leetcode.hdkshjm.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("cbaebabacd", "abc", Arrays.asList(0,6)),
                Arguments.of("abab", "ab", Arrays.asList(0,1,2))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, String p, List<Integer> expected) {
        List<Integer> actual = solution.findAnagrams(s, p);
        Assertions.assertEquals(expected, actual);
    }

}
