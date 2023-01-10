package leetcode.hdkshjm.problem.no1000_1999.no1249;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("lee(t(c)o)de)", "lee(t(c)o)de"),
                Arguments.of("a)b(c)d", "ab(c)d"),
                Arguments.of("))((", ""),
                Arguments.of("(a(b(c)d)", "a(b(c)d)")
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void testMinRemoveToMakeValid(String s, String expected) {
        String result = solution.minRemoveToMakeValid(s);
        System.out.println(expected + " " + result);
        Assertions.assertEquals(expected, result);
    }
}
