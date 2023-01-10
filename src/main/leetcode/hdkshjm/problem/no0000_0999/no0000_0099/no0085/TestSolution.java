package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0085;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}, 6),
                Arguments.of(new char[][]{{'0'}}, 0),
                Arguments.of(new char[][]{{'1'}}, 1),
                Arguments.of(new char[][]{{'0', '0'}}, 0),
                Arguments.of(new char[][]{{'1', '1', '0', '1'},{'1', '1', '0', '1'},{'1', '1', '1', '1'}}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(char[][] matrix, int expected) {
        int actual = solution.maximalRectangle(matrix);
        Assertions.assertEquals(expected, actual);
    }
}
