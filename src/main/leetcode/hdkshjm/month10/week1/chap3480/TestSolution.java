package leetcode.hdkshjm.month10.week1.chap3480;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSolution {

    RecentCounter rc = new RecentCounter();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[] { 1, 100, 3001, 3002 }, new int[] { 1, 2, 3, 3 })
                );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int[] expected) {
        for (int i = 0; i < nums.length; i++) {
            int result = rc.ping(nums[i]);
            Assertions.assertEquals(expected[i], result);
        }
    }
}
