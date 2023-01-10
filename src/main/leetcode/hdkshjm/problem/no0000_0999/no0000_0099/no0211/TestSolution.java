package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0211;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(
                        new String[]{"WordDictionary", "addWord", "addWord", "addWord", "search", "search", "search", "search"},
                        new String[]{null, "bad", "dad", "mad", "pad", "bad", ".ad", "b.."},
                        new Boolean[]{null, null, null, null, false, true, true, true}),
                Arguments.of(
                        new String[]{"WordDictionary", "addWord", "addWord", "search", "search", "search", "search", "search", "search", "search", "search"},
                        new String[]{null, "a", "ab", "a", "a.", "ab", ".a", ".b", "ab.", ".", ".."},
                        new Boolean[]{null, null, null, true, true, true, false, true, false, true, true}),
                Arguments.of(
                        new String[]{"WordDictionary", "addWord", "addWord", "addWord", "addWord", "search", "search", "addWord", "search", "search", "search", "search", "search", "search"},
                        new String[]{null, "at", "and", "an", "add", "a", ".at", "bat", ".at", "an.", "a.d.", "b.", "a.d", "."},
                        new Boolean[]{null, null, null, null, null, false, false, null, true, true, false, false, true, false})
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String[] methods, String[] args, Boolean[] expected) {
        WordDictionary dic = null;
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i] + "," + args[i] + "->" + expected[i]);
            if (methods[i] == "WordDictionary") dic = new WordDictionary();
            if (methods[i] == "addWord") dic.addWord(args[i]);
            if (methods[i] == "search") Assertions.assertEquals(expected[i], dic.search(args[i]));
        }
    }
}
