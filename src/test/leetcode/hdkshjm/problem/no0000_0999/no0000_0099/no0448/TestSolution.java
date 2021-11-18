package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0448;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 3, 2, 7, 8, 2, 3, 1}, Arrays.asList(5, 6))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, List<Integer> expected) {
        List<Integer> actual = solution.findDisappearedNumbers(nums);
        Assertions.assertEquals(expected, actual);
    }
}
