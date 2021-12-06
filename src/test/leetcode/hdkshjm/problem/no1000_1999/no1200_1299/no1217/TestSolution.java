package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1217;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 1),
                Arguments.of(new int[]{2, 2, 2, 3, 3}, 2),
                Arguments.of(new int[]{1, 1000000000}, 1),
                Arguments.of(new int[]{1, 2, 2, 2, 2}, 1)
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] position, int expected) {
        int result = solution.minCostToMoveChips(position);
        Assertions.assertEquals(expected, result);
    }
}
