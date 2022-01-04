package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1009;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
Solution solution = new  Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(5,2),
                Arguments.of(7,0),
                Arguments.of(10,5)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int n, int expected) {
        int actual = solution.bitwiseComplement(n);
        Assertions.assertEquals(expected, actual);
    }
}
