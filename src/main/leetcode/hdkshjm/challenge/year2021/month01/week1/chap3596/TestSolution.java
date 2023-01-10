package leetcode.hdkshjm.challenge.year2021.month01.week1.chap3596;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new String[]{"ab", "c"}, new String[]{"a", "bc"}, true),
                Arguments.of(new String[]{"a", "cb"}, new String[]{"ab", "c"}, false),
                Arguments.of(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String[] word1, String[] word2, boolean expected) {
        boolean actual = solution.arrayStringsAreEqual(word1, word2);
        Assertions.assertEquals(expected, actual);
    }
}
