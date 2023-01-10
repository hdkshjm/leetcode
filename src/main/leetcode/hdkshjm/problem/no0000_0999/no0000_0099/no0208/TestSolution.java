package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0208;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {


    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new String[]{"insert", "search", "search", "startsWith", "insert", "search"},
                        new String[]{"apple", "apple", "app", "app", "app", "app"},
                        new Boolean[]{null, true, false, true, null, true}),
                Arguments.of(new String[]{"insert", "insert", "insert", "insert", "insert", "insert", "search", "search", "search", "search", "search", "search", "search", "search", "search", "startsWith", "startsWith", "startsWith", "startsWith", "startsWith", "startsWith", "startsWith", "startsWith", "startsWith"},
                        new String[]{"app", "apple", "beer", "add", "jam", "rental", "apps", "app", "ad", "applepie", "rest", "jan", "rent", "beer", "jam", "apps", "app", "ad", "applepie", "rest", "jan", "rent", "beer", "jam"},
                        new Boolean[]{null, null, null, null, null, null, false, true, false, false, false, false, false, true, true, false, true, true, false, false, false, true, true, true})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String[] methods, String[] args, Boolean[] expected) {
        Trie trie = new Trie();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i] == "insert") trie.insert(args[i]);
            if (methods[i] == "search") Assertions.assertEquals(expected[i], trie.search(args[i]));
            if (methods[i] == "startsWith") Assertions.assertEquals(expected[i], trie.startsWith(args[i]));
        }
    }
}
