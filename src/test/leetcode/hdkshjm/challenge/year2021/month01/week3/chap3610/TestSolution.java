package leetcode.hdkshjm.challenge.year2021.month01.week3.chap3610;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("{[]}", true)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, boolean expected) {
        boolean actual = solution.isValid(s);
        Assertions.assertEquals(expected, actual);
    }
}
