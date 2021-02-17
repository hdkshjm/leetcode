package leetcode.hdkshjm.challenge.year2021.month02.week3.chap3640;

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
                Arguments.of(Arrays.asList(1, 3, 10, 5), Arrays.asList(3, 0, 5, 3), 5, Arrays.asList(5, 10))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(List<Integer> pid, List<Integer> ppid, int kill, List<Integer> expected) {
        List<Integer> actual = solution.killProcess(pid, ppid, kill);
        Assertions.assertEquals(expected, actual);
    }
}
