package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0881;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, 3, 1),
                Arguments.of(new int[]{3, 2, 2, 1}, 3, 3),
                Arguments.of(new int[]{3, 5, 3, 4}, 5, 4),
                Arguments.of(new int[]{3, 2, 3, 2, 2}, 6, 3),
                Arguments.of(new int[]{3, 8, 4, 9, 2, 2, 7, 1, 6, 10, 6, 7, 1, 7, 7, 6, 4, 4, 10, 1}, 10, 11)

        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] people, int limit, int expected) {
        int actual = solution.numRescueBoats(people, limit);
        Assertions.assertEquals(expected, actual);
    }
}
