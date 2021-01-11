package leetcode.hdkshjm.challenge.year2021.month01.week2.chap3599;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class TestSolution {
    Solution solution = new Solution();

    static Stream<Arguments> testProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 5, 6, 2}, 1),
                Arguments.of(new int[]{1, 2, 3, 6, 5, 4}, 3),
                Arguments.of(new int[]{1, 3, 3, 3, 2, 4, 2, 1, 2}, 4),
                Arguments.of(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2}, 0)
        );
    }

    static Stream<Arguments> testFromFileProvider() {
        return Stream.of(
                Arguments.of("./testdata1.txt", 188426454));
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] instructions, int expected) {
        int actual = solution.createSortedArray(instructions);
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @MethodSource("testFromFileProvider")
    void testFromFile(String filename, int expected) throws IOException {
        Path path = Paths.get(getClass().getResource(filename).getPath());
        String text = Files.readString(path);
        int[] instructions = Arrays.stream(text.split(",")).mapToInt(Integer::valueOf).toArray();

        int actual = solution.createSortedArray(instructions);
        Assertions.assertEquals(expected, actual);
    }
}
