package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0374;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(10, 6),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(2, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int num, int pick) {
        solution.setPick(pick);
        int actual = solution.guessNumber(num);
        Assertions.assertEquals(pick, actual);
    }
}
