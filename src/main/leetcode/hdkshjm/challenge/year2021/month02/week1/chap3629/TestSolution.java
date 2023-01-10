package leetcode.hdkshjm.challenge.year2021.month02.week1.chap3629;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("/home/", "/home"),
                Arguments.of("/../", "/"),
                Arguments.of("/home//foo/", "/home/foo"),
                Arguments.of("/a/./b/../../c/", "/c")
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String path, String expected) {
        String actual = solution.simplifyPath(path);
        Assertions.assertEquals(expected, actual);
    }
}
