package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0520;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("USA", true),
                Arguments.of("FlaG", false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String word, boolean expected) {
        boolean actual = solution.detectCapitalUse(word);
        Assertions.assertEquals(expected, actual);
    }
}
