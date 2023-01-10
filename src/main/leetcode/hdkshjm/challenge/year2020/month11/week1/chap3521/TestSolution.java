package leetcode.hdkshjm.challenge.year2020.month11.week1.chap3521;

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
                Arguments.of(new int[]{1, 2, 5, 9}, 6, 5),
                Arguments.of(new int[]{2, 3, 5, 7, 11}, 11, 3),
                Arguments.of(new int[]{19}, 5, 4),
                Arguments.of(new int[]{16, 79, 6, 43, 53}, 172, 2),
                Arguments.of(new int[]{962551, 933661, 905225, 923035, 990560}, 10, 495280)
        );
    }

    static Stream<Arguments> testFromFileProvider() {
        return Stream.of(
                Arguments.of("./testdata1.txt", 83091, 445588));
    }

    @ParameterizedTest
    @MethodSource("testProvider")
    void test(int[] nums, int threshold, int expected) {
        int actual = solution.smallestDivisor(nums, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("testFromFileProvider")
    void testFromFile(String filename, int threshold, int expected) throws IOException {
        Path path = Paths.get(getClass().getResource(filename).getPath());
        String text = Files.readString(path);
        int[] nums = Arrays.stream(text.split(",")).mapToInt(Integer::valueOf).toArray();

        int actual = solution.smallestDivisor(nums, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
