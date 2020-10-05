package leetcode.hdkshjm.month10.week3_3461;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(
                        "Hello World", 5),
                Arguments.of("", 0),
                Arguments.of("             ", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void insert(String s, int expected) {
        int result = solution.lengthOfLastWord(s);
        Assertions.assertEquals(expected, result);

    }
}
