package leetcode.hdkshjm.challenge.year2021.month01.week2.chap3602;

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
                Arguments.of(new int[]{2, 2}, 6, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] people, int limit, int expected) {
        int actual = solution.numRescueBoats(people, limit);
        Assertions.assertEquals(expected, actual);
    }
}
