package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0451;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("tree", "eert"),
                Arguments.of("cccaaa", "aaaccc"),
                Arguments.of("Aabb", "bbAa"),
                Arguments.of("Aa11", "11Aa")
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, String expected) {
        String actual = solution.frequencySort(s);
        Assertions.assertEquals(expected, actual);
    }
}
