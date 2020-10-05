package leetcode.hdkshjm.month10.week2_3455;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestSolution {

    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "1807, 7810, 1A3B", 
            "1123, 0111, 1A1B",
            "1122, 2211, 0A4B",
    })
    void getHint(String secret, String guess, String expected) {
        String result = solution.getHint(secret, guess);
        Assertions.assertEquals(expected, result);
    }

}
