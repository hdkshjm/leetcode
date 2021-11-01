package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0130;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}},
                        new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}}),
                Arguments.of(new char[][]{{'O', 'X', 'X', 'O'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'O', 'X', 'O', 'O'}},
                        new char[][]{{'O', 'X', 'X', 'O'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'O', 'X', 'O', 'O'}}),
                Arguments.of(new char[][]{{'X'}}, new char[][]{{'X'}})
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(char[][] board, char[][] expected) {
        Solution s = new Solution();
        s.solve(board);
        for (int i = 0; i < expected.length; i++) Assertions.assertArrayEquals(expected[i], board[i]);
    }
}
