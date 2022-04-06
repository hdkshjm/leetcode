package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0923;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, 8, 20),
                Arguments.of(new int[]{1, 1, 2, 2, 2, 2}, 5, 12)
        );
    }

    static Stream<Arguments> testProvider2() {
        return Stream.of(
                Arguments.of(3000, 495500972)
        );
    }

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] arr, int target, int expected) {
        int actual = solution.threeSumMulti(arr, target);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("testProvider2")
    void test2(int num, int expected) {
        int[] arr = new int[num];
        int actual = solution.threeSumMulti(arr, 0);
        Assertions.assertEquals(expected, actual);
    }
}

