package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0155;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {


    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new String[]{"MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"},
                        new Integer[]{null, -2, 0, -3, null, null, null, null},
                        new Integer[]{null, null, null, null, -3, null, 0, -2}),
                Arguments.of(new String[]{"MinStack", "push", "push", "push", "getMin", "top", "pop", "getMin"},
                        new Integer[]{null, -2, 0, -1, null, null, null, null},
                        new Integer[]{null, null, null, null, -2, -1, null, -2})
        );
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(String[] methods, Integer[] args, Integer[] expected) {
        MinStack stack = null;
        for (int i = 0; i < methods.length; i++) {
            if (methods[i] == "MinStack") stack = new MinStack();
            if (methods[i] == "push") stack.push(args[i]);
            if (methods[i] == "top") Assertions.assertEquals((int) expected[i], stack.top());
            if (methods[i] == "pop") stack.pop();
            if (methods[i] == "getMin") Assertions.assertEquals((int) expected[i], stack.getMin());
        }
    }
}
