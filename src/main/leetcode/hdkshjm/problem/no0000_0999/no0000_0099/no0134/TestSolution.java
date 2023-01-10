package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0134;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}, 3),
                Arguments.of(new int[]{2, 3, 4}, new int[]{3, 4, 3}, -1),
                Arguments.of(new int[]{5, 8, 2, 8}, new int[]{6, 5, 6, 6}, 3)

        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] gas, int[] cost, int expected) {
        Solution solution = new Solution();
        int actual = solution.canCompleteCircuit(gas, cost);
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(expected, actual);
    }
}
