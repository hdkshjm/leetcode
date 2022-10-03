package leetcode.hdkshjm.problem.no1000_1999.no1578;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("aabaa", new int[]{1, 2, 3, 4, 1}, 2),
                Arguments.of("abc", new int[]{1, 2, 1}, 0),
                Arguments.of("abaac", new int[]{1, 2, 3, 4, 5}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String colors, int[] neededTime, int expected) {
        int actual = solution.minCost(colors, neededTime);
        Assertions.assertEquals(expected, actual);
    }
}
