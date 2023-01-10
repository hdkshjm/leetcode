package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0290;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of("abba", "dog cat cat dog", true),
                Arguments.of("abba", "dog cat cat fish", false),
                Arguments.of("aaaa", "dog cat cat dog", false),
                Arguments.of("abc", "dog cat dog", false),
                Arguments.of("abba", "dog dog dog dog", false),
                Arguments.of("abba",  "dog cat cat dog", true)
        );
        return of;
    }

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String pattern, String s, boolean expected) {
        boolean actual = solution.wordPattern(pattern, s);
        Assertions.assertEquals(expected, actual);
    }
}
