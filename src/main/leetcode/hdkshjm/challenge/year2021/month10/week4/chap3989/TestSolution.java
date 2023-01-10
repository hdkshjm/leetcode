package leetcode.hdkshjm.challenge.year2021.month10.week4.chap3989;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}, 2),
                Arguments.of(new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"}, 3),
                Arguments.of(new String[]{"test.email+alex@leetcode.com", "test.email.leet+alex@code.com"}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String[] emails, int expected) {
        int actual = solution.numUniqueEmails(emails);
        Assertions.assertEquals(expected, actual);
    }
}
