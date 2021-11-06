package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0260;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(new int[]{1, 2, 1, 3, 2, 5}, new int[]{3, 5}),
                Arguments.of(new int[]{-1, 0}, new int[]{-1, 0}),
                Arguments.of(new int[]{0, 1}, new int[]{0, 1})
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int[] expected) {
        Solution s = new Solution();
        int[] actual = s.singleNumber(nums);
        Assertions.assertArrayEquals(expected, actual);
    }
}
