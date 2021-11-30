package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0721;

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
                Arguments.of(
                        Arrays.asList(
                                Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                                Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"),
                                Arrays.asList("Mary", "mary@mail.com"),
                                Arrays.asList("John", "johnnybravo@mail.com")
                        ),
                        Arrays.asList(
                                Arrays.asList("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"),
                                Arrays.asList("Mary", "mary@mail.com"),
                                Arrays.asList("John", "johnnybravo@mail.com")
                        )
                ),
                Arguments.of(
                        Arrays.asList(
                                Arrays.asList("David", "David0@m.co", "David1@m.co"),
                                Arrays.asList("David", "David3@m.co", "David4@m.co"),
                                Arrays.asList("David", "David4@m.co", "David5@m.co"),
                                Arrays.asList("David", "David2@m.co", "David3@m.co"),
                                Arrays.asList("David", "David4@m.co", "David5@m.co"),
                                Arrays.asList("David", "David1@m.co", "David2@m.co")
                        ),
                        Arrays.asList(
                                Arrays.asList("David","David0@m.co","David1@m.co","David2@m.co","David3@m.co","David4@m.co","David5@m.co")
                        )
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(List<List<String>> accounts, List<List<String>> expected) {
        List<List<String>> actual = solution.accountsMerge(accounts);
        Assertions.assertEquals(expected, actual);
    }
}
