package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0308;

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
                        new String[]{"RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"},
                        new Integer[]{null, 1, 2, 2, null, 1, 2, null},
                        new Object[]{null, true, false, true, Arrays.asList(1, 2), true, false, Arrays.asList(2)}),
                Arguments.of(
                        new String[]{"RandomizedSet", "insert", "insert", "insert", "insert", "getRandom"},
                        new Integer[]{null, 1, 10, 20, 30, null},
                        new Object[]{null, true, true, true, true, Arrays.asList(1, 10, 20, 30)})
        );
        return of;
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String[] methods, Integer[] args, Object[] expected) {
        RandomizedSet rs = null;
        for (int i = 0; i < methods.length; i++) {
            if (methods[i] == "RandomizedSet") rs = new RandomizedSet();
            if (methods[i] == "insert") Assertions.assertEquals((Boolean) expected[i], rs.insert(args[i]));
            if (methods[i] == "remove") Assertions.assertEquals((Boolean) expected[i], rs.remove(args[i]));
            if (methods[i] == "getRandom")
                Assertions.assertTrue(((List<Integer>) expected[i]).contains(rs.getRandom()));
        }
    }
}
