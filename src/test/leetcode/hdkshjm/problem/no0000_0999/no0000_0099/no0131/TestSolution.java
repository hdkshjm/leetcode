package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0131;


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
                Arguments.of("aab", Arrays.asList(Arrays.asList("a", "a", "b"), Arrays.asList("aa", "b"))),
                Arguments.of("a", Arrays.asList(Arrays.asList("a"))),
                Arguments.of("aaba", Arrays.asList(Arrays.asList("a", "a", "b", "a"), Arrays.asList("a", "aba"),  Arrays.asList("aa", "b", "a")))
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String s, List<List<String>> expected) {
        Solution solution = new Solution();
        List<List<String>> actual = solution.partition(s);
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) Assertions.assertEquals(expected.get(i), actual.get(i));
    }
}
