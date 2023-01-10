package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0017;

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
                Arguments.of("23", Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")),
                Arguments.of("", Arrays.asList()),
                Arguments.of("2", Arrays.asList("a", "b", "c"))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String digits, List<String> expected) {
        List<String> result = solution.letterCombinations(digits);
        Assertions.assertEquals(expected, result);
    }
}
