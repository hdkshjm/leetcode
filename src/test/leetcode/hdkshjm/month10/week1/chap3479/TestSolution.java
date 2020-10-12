package leetcode.hdkshjm.month10.week1.chap3479;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSolution {

    Solution s = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
            Arguments.of(List.of(List.of(1, 2, 3), List.of(4, 5), List.of(1, 2, 3)), 4),
            Arguments.of(List.of(List.of(1), List.of(1)), 0),
            Arguments.of(List.of(List.of(1), List.of(2)), 1),
            Arguments.of(List.of(List.of(1, 4), List.of(0, 5)), 4),
            Arguments.of(List.of(List.of(-2), List.of(-3, -2, 1)), 3),
            Arguments.of(List.of(List.of(-1,1), List.of(-3, 1, 4), List.of(-2, -1, 0, 2)), 6)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(List<List<Integer>> arrays, int expected) {
        int result = s.maxDistance(arrays);
        Assertions.assertEquals(expected, result);
    }
}
