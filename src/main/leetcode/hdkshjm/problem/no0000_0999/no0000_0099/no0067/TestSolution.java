package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0067;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("1010", "1011", "10101"),
                Arguments.of("100", "110010", "110110")
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String a, String b, String expected) {
        String actual = solution.addBinary(a, b);
        Assertions.assertEquals(expected, actual);
    }
}
