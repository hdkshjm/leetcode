package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0416;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1,5,11,5}, true),
                Arguments.of(new int[]{1,2,3,5}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, boolean expected) {
        boolean actual = solution.canPartition(nums);
        Assertions.assertEquals(expected, actual);
    }
}
