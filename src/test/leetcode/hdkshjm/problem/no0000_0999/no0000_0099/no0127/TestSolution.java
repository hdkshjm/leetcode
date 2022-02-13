package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0127;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of("hit", "cog", new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")), 5),
                Arguments.of("hit", "cog", new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log")), 0),
                Arguments.of("a", "c", new ArrayList<>(Arrays.asList("a", "b", "c")), 2),
                Arguments.of("red", "tax", new ArrayList<>(Arrays.asList("ted", "tex", "red", "tax", "tad", "den", "rex", "pee")), 4),
                Arguments.of("lost", "miss", new ArrayList<>(Arrays.asList("most", "mist", "miss", "lost", "fist", "fish")), 4)
        );
        return of;
    }

    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String beginWord, String endWord, List<String> wordList, int expected) {
        int actual = solution.ladderLength(beginWord, endWord, wordList);
        Assertions.assertEquals(expected, actual);
    }
}
