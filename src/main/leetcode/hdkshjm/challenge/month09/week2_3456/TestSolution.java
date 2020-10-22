package leetcode.hdkshjm.challenge.month09.week2_3456;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestSolution {

    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
        "2 3 -2 4, 6", 
        "-2 0 -1, 0",
        "-2 2 3 4 -1 5, 240",
        "-2 0 -1, 0",
        "0 2, 2",
        "-2, -2",
        "0, 0",
        "-5 0 2, 2",
        "-1 -2 -3 0 , 6",
    })
    void maxProduct(String nums, String expected) {
        int[] numsArray = Arrays.stream(nums.split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = solution.maxProduct(numsArray);
        Assertions.assertEquals(Integer.parseInt(expected), result);
    }


}
