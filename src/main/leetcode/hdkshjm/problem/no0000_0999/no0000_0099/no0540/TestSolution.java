package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0540;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}, 2),
                Arguments.of(new int[]{3, 3, 7, 7, 10, 11, 11}, 10),
                Arguments.of(new int[]{1, 1, 2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int expected) {
        int actual = solution.singleNonDuplicate(nums);
        Assertions.assertEquals(expected, actual);
    }
}
