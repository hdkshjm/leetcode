package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0763;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of("ababcbacadefegdehijhklij", Arrays.asList(9, 7, 8)),
                Arguments.of("eccbbbbdec", Arrays.asList(10))
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, List<Integer> expected) {
        List<Integer> actual = solution.partitionLabels(s);
        Assertions.assertEquals(expected, actual);
    }
}
