package leetcode.hdkshjm.september.week2_3459;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestSolution {

    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "1 2 3 1, 4", 
            "2 7 9 3 1, 12",

    })
    void rob(String numsString, int expected) {

        int[] nums = Arrays.stream(numsString.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println("nums=" + Arrays.toString(nums));

        int result = solution.rob(nums);
        Assertions.assertEquals(expected, result);

    }


}
