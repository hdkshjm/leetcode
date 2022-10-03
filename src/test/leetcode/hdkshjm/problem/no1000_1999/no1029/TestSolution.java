package leetcode.hdkshjm.problem.no1000_1999.no1029;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}}, 110),
                Arguments.of(new int[][]{{20, 10}, {200, 30}, {50, 400}, {20, 30}}, 110),
                Arguments.of(new int[][]{{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}}, 1859),
                Arguments.of(new int[][]{{515, 563}, {451, 713}, {537, 709}, {343, 819}, {855, 779}, {457, 60}, {650, 359}, {631, 42}}, 3086)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] costs, int expected) {
        int actual = solution.twoCitySchedCost(costs);
        Assertions.assertEquals(expected, actual);
    }
}
