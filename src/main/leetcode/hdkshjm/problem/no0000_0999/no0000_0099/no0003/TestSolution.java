package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0003;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3),
                Arguments.of("dvdf", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void twoSum(String s, int expected) {
        int result = solution.lengthOfLongestSubstring(s);
        Assertions.assertEquals(expected, result);
    }
}
