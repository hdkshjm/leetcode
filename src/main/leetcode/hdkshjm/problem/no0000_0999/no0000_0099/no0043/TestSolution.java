package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0043;

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
                Arguments.of("2", "3", "6"),
                Arguments.of("9", "9", "81"),
                Arguments.of("123", "456", "56088"),
                Arguments.of("9333852702227987", "85731737104263", "800207406037324579815815608581")
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String num1, String num2, String expected) {
        String result = solution.multiply(num1, num2);
        Assertions.assertEquals(expected, result);
    }
}
