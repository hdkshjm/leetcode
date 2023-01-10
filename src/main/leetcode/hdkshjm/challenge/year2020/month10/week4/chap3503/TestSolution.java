package leetcode.hdkshjm.challenge.year2020.month10.week4.chap3503;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int target, int expected) {
        ArrayReader reader = new ArrayReaderImpl(nums);

        int actual = solution.search(reader, target);
        Assertions.assertEquals(expected, actual);
    }
}
