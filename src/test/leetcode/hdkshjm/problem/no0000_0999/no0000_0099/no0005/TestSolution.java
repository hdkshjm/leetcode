package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0005;


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
                Arguments.of("babad", Arrays.asList("bab","aba")),
                Arguments.of("cbbd", Arrays.asList("bb")),
                Arguments.of("a", Arrays.asList("a")),
                Arguments.of("ac", Arrays.asList("a","c")),
                Arguments.of("bb", Arrays.asList("bb")),
                Arguments.of("ccd", Arrays.asList("cc"))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void findMedianSortedArrays(String s, List<String> expected) {
        String result = solution.longestPalindrome(s);
        System.out.println("result=" + result);
        Assertions.assertTrue(expected.contains(result));
    }
}
