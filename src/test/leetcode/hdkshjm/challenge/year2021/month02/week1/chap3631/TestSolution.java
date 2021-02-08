package leetcode.hdkshjm.challenge.year2021.month02.week1.chap3631;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("loveleetcode", 'e', new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}),
                Arguments.of("aaab", 'b', new int[]{3, 2, 1, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, char c, int[] expected) {
        int[] actual = solution.shortestToChar(s, c);
        Assertions.assertArrayEquals(expected, actual);
    }
}
