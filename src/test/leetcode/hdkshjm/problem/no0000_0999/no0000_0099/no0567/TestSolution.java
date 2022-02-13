package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0567;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("ab", "eidbaooo", true),
                Arguments.of("ab", "eidboaoo", false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s1, String s2, boolean expected) {
        boolean actual = solution.checkInclusion(s1, s2);
        Assertions.assertEquals(expected, actual);
    }
}
