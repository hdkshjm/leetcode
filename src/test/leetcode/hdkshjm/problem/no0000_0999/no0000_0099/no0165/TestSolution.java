package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0165;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("1.01", "1.001", 0),
                Arguments.of("1.0", "1.0.0", 0),
                Arguments.of("0.1", "1.1", -1),
                Arguments.of("1.0.1", "1", 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String version1, String version2, int expected) {
        Solution solution = new Solution();
        Assertions.assertEquals(solution.compareVersion(version1, version2), expected);
    }
}
