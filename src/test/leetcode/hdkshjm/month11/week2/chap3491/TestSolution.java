package leetcode.hdkshjm.month11.week2.chap3491;

import leetcode.hdkshjm.month11.week2.chap3489.Codec;
import leetcode.hdkshjm.month11.week2.chap3489.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("abcd", "abcd"),
                Arguments.of("bcabc", "abc"),
                Arguments.of("cbacdcbc", "acdb")
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void testRemoveDuplicateLetters(String s, String expected) {
        String result = solution.removeDuplicateLetters(s);
        Assertions.assertEquals(expected, result);
    }
}