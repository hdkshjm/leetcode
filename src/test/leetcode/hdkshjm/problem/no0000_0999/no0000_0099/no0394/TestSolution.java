package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0394;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("3[a]2[bc]", "aaabcbc"),
                Arguments.of("3[a2[c]]", "accaccacc"),
                Arguments.of("2[abc]3[cd]ef", "abcabccdcdcdef"),
                Arguments.of("abc3[cd]xyz", "abccdcdcdxyz"),
                Arguments.of("10[leetcode]", "leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode")
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, String expected) {
        String actual = solution.decodeString(s);
        Assertions.assertEquals(expected, actual);
    }
}
