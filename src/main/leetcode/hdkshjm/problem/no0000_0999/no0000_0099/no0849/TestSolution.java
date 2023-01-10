package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0849;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 0, 0, 1, 0, 1}, 2),
                Arguments.of(new int[]{1, 0, 0, 0}, 3),
                Arguments.of(new int[]{0, 1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] seats, int expected) {
        int actual = solution.maxDistToClosest(seats);
        Assertions.assertEquals(expected, actual);
    }
}
