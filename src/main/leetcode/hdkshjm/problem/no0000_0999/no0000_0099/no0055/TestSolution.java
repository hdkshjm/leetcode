package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0055;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1, 1, 4}, true),
                Arguments.of(new int[]{3, 2, 1, 0, 4}, false),
                Arguments.of(new int[]{2,  0, 0}, true),
                Arguments.of(new int[]{2, 1, 0, 0}, false),
                Arguments.of(new int[]{4,2,0,0,1,1,4,4,4,0,4,0}, true),
                Arguments.of(new int[]{8,2,4,4,4,9,5,2,5,8,8,0,8,6,9,1,1,6,3,5,1,2,6,6,0,4,8,6,0,3,2,8,7,6,5,1,7,0,3,4,8,3,5,9,0,4,0,1,0,5,9,2,0,7,0,2,1,0,8,2,5,1,2,3,9,7,4,7,0,0,1,8,5,6,7,5,1,9,9,3,5,0,7,5}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, boolean expected) {
        boolean actual = solution.canJump(nums);
        Assertions.assertEquals(expected, actual);
    }
}
