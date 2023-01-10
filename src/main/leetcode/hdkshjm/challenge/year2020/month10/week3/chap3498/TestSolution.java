package leetcode.hdkshjm.challenge.year2020.month10.week3.chap3498;

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
                Arguments.of("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT", Arrays.asList("AAAAACCCCC", "CCCCCAAAAA")),
                Arguments.of("AAAAAAAAAAAAA", Arrays.asList("AAAAAAAAAA"))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, List<String> expected) {
        List<String> result = solution.findRepeatedDnaSequences(s);
        Assertions.assertEquals(expected, result);
    }
}
