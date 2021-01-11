package leetcode.hdkshjm.challenge.year2021.month01.week2.chap3600;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6}),
                Arguments.of(new int[]{1}, 1, new int[]{}, 0, new int[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        solution.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expected, nums1);
    }
}
