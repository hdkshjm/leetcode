package leetcode.hdkshjm.challenge.year2020.month11.week1.chap3518;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("leetcode", 2),
                Arguments.of("abbcccddddeeeeedcba", 5),
                Arguments.of("triplepillooooow", 5),
                Arguments.of("hooraaaaaaaaaaay", 11),
                Arguments.of("tourist", 1),
                Arguments.of("cc", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, int expected) {
        int actual = solution.maxPower(s);
        Assertions.assertEquals(expected, actual);
    }
}
