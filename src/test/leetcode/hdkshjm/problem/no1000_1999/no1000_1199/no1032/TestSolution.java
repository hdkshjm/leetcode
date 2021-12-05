package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1032;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(
                        new String[]{"StreamChecker", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query", "query"},
                        new Object[][]{{"cd", "f", "kl"}, {'a'}, {'b'}, {'c'}, {'d'}, {'e'}, {'f'}, {'g'}, {'h'}, {'i'}, {'j'}, {'k'}, {'l'}},
                        new Boolean[]{null, false, false, false, true, false, true, false, false, false, false, false, true}
                )
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String[] methods, Object[][] args, Boolean[] expected) {
        StreamChecker checker = null;
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].equals("StreamChecker"))
                checker = new StreamChecker(Arrays.stream(args[i]).map(Object::toString).toArray(String[]::new));
            if (methods[i].equals("query"))
                Assertions.assertEquals(expected[i], checker.query((char) args[i][0]));
        }
    }
}

