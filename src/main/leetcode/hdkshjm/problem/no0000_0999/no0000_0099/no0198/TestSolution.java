package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0198;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, 4),
                Arguments.of(new int[]{2, 7, 9, 3, 1}, 12)
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int expected) {
        Solution solution = new Solution();
        int actual = solution.rob(nums);
        Assertions.assertEquals(expected, actual);
    }
}
