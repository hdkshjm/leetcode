package leetcode.hdkshjm.challenge.year2020.month09.week5.chap3477;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("leetcode", Arrays.asList(new String[] { "leet", "code" }), true),
                Arguments.of("applepenapple", Arrays.asList(new String[] { "apple", "pen" }), true),
                Arguments.of("catsandog", Arrays.asList(new String[] { "cats", "dog", "sand", "and", "cat" }), false),
                Arguments.of("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", 
                        Arrays.asList(new String[] {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa" }), false)
                

                );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void wordBreak(String s, List<String> wordDict, boolean expected) {
        boolean result = solution.wordBreak(s, wordDict);
        Assertions.assertEquals(expected, result);

    }
}
