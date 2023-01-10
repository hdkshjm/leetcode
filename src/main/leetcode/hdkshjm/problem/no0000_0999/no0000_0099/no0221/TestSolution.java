package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0221;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}, 4),
                Arguments.of(new char[][]{{'0', '1'}, {'1', '0'}}, 1)
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(char[][] matrix, int expected) {
        Solution s = new Solution();
        int actual = s.maximalSquare(matrix);
        Assertions.assertEquals(expected, actual);
    }
}
