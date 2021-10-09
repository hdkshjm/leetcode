package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0212;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}},
                        new String[]{"oath", "pea", "eat", "rain"},
                        Arrays.asList("eat", "oath")),
                Arguments.of(new char[][]{{'a', 'b'}, {'c', 'd'}},
                        new String[]{"abcb"},
                        Arrays.asList())
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(char[][] board, String[] words, List<String> expected) {
        Solution s = new Solution();
        List<String> actual = s.findWords(board, words);
        Collections.sort(actual);
        Assertions.assertEquals(expected, actual);
    }
}
