package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1306;

import leetcode.hdkshjm.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 2, 3, 0, 3, 1, 2}, 5, true),
                Arguments.of(new int[]{4, 2, 3, 0, 3, 1, 2}, 0, true),
                Arguments.of(new int[]{3, 0, 2, 1, 2}, 2, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] arr, int start, boolean expected) {
        boolean result = solution.canReach(arr, start);
        Assertions.assertEquals(expected, result);
    }
}
