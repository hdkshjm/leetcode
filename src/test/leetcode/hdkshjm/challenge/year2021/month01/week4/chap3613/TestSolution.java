package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3613;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("abc", "bca", true),
                Arguments.of("a", "aa", false),
                Arguments.of("cabbba", "abbccc", true),
                Arguments.of("cabbba", "aabbss", false),
                Arguments.of("uau", "ssx", false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String word1, String word2, boolean expected) {
        boolean actual = solution.closeStrings(word1, word2);
        Assertions.assertEquals(expected, actual);
    }
}
