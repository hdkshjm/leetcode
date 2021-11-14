package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1286;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    static Stream<Arguments> testProvider() {
        Stream<Arguments> of = Stream.of(
                Arguments.of(
                        new String[]{"CombinationIterator", "next", "hasNext", "next", "hasNext", "next", "hasNext"},
                        new Object[][]{new Object[]{"abc", 2}, null, null, null, null, null, null, null},
                        new Object[]{null, "ab", true, "ac", true, "bc", false}
                ),
                Arguments.of(
                        new String[]{"CombinationIterator", "hasNext", "next", "hasNext", "hasNext", "next", "next", "hasNext", "hasNext", "hasNext", "hasNext"},
                        new Object[][]{new Object[]{"chp", 1}, null, null, null, null, null, null, null},
                        new Object[]{null, true, "c", true, true, "h", "p", false, false, false, false}
                ),
                Arguments.of(
                        new String[]{"CombinationIterator", "hasNext", "hasNext", "next", "next", "hasNext", "hasNext", "next", "hasNext", "hasNext", "hasNext"},
                        new Object[][]{new Object[]{"bvwz", 2}, null, null, null, null, null, null, null},
                        new Object[]{null, true, true, "bv", "bw", true, true, "bz", true, true, true}
                )
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String[] methods, Object[][] args, Object[] expected) {
        CombinationIterator ite = null;
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].equals("CombinationIterator"))
                ite = new CombinationIterator((String) (args[i][0]), (Integer) (args[i][1]));
            if (methods[i].equals("next"))
                Assertions.assertEquals((String) expected[i], ite.next());
            if (methods[i].equals("hasNext"))
                Assertions.assertEquals((Boolean) expected[i], ite.hasNext());
        }
    }
}
