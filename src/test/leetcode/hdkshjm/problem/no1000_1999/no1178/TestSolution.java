package leetcode.hdkshjm.problem.no1000_1999.no1178;

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
                Arguments.of(new String[]{"aaaa", "asas", "able", "ability", "actt", "actor", "access"}, new String[]{"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"}, Arrays.asList(1, 1, 3, 2, 4, 0)),
                Arguments.of(new String[]{"apple", "pleas", "please"}, new String[]{"aelwxyz", "aelpxyz", "aelpsxy", "saelpxy", "xaelpsy"}, Arrays.asList(0, 1, 3, 2, 0))
                );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void testMinRemoveToMakeValid(String[] words, String[] puzzles, List<Integer> expected) {
        List<Integer> result = solution.findNumOfValidWords(words, puzzles);
        Assertions.assertEquals(expected, result);
    }
}
