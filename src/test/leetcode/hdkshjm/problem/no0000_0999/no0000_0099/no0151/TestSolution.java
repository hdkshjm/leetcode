package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0151;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("the sky is blue", "blue is sky the"),
                Arguments.of("  hello world  ", "world hello"),
                Arguments.of("a good   example", "example good a"),
                Arguments.of("  Bob    Loves  Alice   ", "Alice Loves Bob"),
                Arguments.of("Alice does not even like bob", "bob like even not does Alice")
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, String expected) {
        String result = solution.reverseWords(s);
        Assertions.assertEquals(expected, result);
    }
}
