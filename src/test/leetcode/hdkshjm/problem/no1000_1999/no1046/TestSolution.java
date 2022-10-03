package leetcode.hdkshjm.problem.no1000_1999.no1046;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{2,7,4,1,8,1}, 1),
                Arguments.of(new int[]{1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] stones, int expected) {
        int actual = solution.lastStoneWeight( stones) ;
        Assertions.assertEquals(expected, actual);
    }
}
