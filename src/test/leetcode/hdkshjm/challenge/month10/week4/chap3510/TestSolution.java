package leetcode.hdkshjm.challenge.month10.week4.chap3510;

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
                Arguments.of(new int[]{0, 1, 2, 4, 5, 7}, Arrays.asList("0->2", "4->5", "7")),
                Arguments.of(new int[]{0, 2, 3, 4, 6, 8, 9}, Arrays.asList("0", "2->4", "6", "8->9")),
                Arguments.of(new int[]{}, Arrays.asList()),
                Arguments.of(new int[]{-1}, Arrays.asList("-1")),
                Arguments.of(new int[]{0}, Arrays.asList("0"))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, List<String> expected) {
        List<String> actual = solution.summaryRanges(nums);
        Assertions.assertEquals(expected, actual);
    }
}
