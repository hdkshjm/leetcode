package leetcode.hdkshjm.challenge.month09.week1_3454;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TestSolution {

    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                 Arguments.of("1.01", "1.001", 0),
                 Arguments.of("1.0", "1.0.0", 0),
                 Arguments.of("0.1", "1.1", -1),
                 Arguments.of("1.0.1", "1", 1),
                Arguments.of("7.5.2.4", "7.5.3", -1));
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void compareVersion(String version1, String version2, int expected) {
        int result = solution.compareVersion(version1, version2);
        Assertions.assertEquals(expected, result);

    }
}

