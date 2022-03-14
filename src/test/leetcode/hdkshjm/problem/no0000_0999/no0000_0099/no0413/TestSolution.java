package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0413;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}, 3),
                Arguments.of(new int[]{1}, 0),
                Arguments.of(new int[]{1,2,3,4,5,6}, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int expected) {
        int actual = solution.numberOfArithmeticSlices(nums);
        Assertions.assertEquals(expected, actual);
    }
}
