package leetcode.hdkshjm.challenge.year2021.month02.week2.chap3636;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("rat", "car", false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, String t, boolean expected) {
        boolean actual = solution.isAnagram(s, t);
        Assertions.assertEquals(expected, actual);
    }
}
