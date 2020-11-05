package leetcode.hdkshjm.challenge.month11.week1.chap3515;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{0, 30}, {5, 10}, {15, 20}}, false),
                Arguments.of(new int[][]{{7, 10}, {2, 4}}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[][] intervals, boolean expected) {
        boolean actual = solution.canAttendMeetings(intervals);
        Assertions.assertEquals(expected, actual);
    }
}
