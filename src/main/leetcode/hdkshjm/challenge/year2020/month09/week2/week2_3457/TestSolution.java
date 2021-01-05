package leetcode.hdkshjm.challenge.year2020.month09.week2.week2_3457;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestSolution {

    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "3, 7, 1 2 4", "3, 9, 1 2 6 / 1 3 5 / 2 3 4",
            "1, 9, 9",
            "2, 9, 1 8 / 2 7 / 3 6 / 4 5",
            "2, 18, ",
            "9, 45, 1 2 3 4 5 6 7 8 9"
    })
    void maxProduct(int k, int n, String expected) {
        List<List<Integer>> expectedList = new ArrayList<List<Integer>>();


        if (expected != null) {
            for (String line : expected.split("/")) {
                List<Integer> list = Arrays.stream(line.trim().split(" ")).map(s -> Integer.parseInt(s))
                        .collect(Collectors.toList());
                expectedList.add(list);
            }
        }

        List<List<Integer>> result = solution.combinationSum3(k, n);
        System.out.println("expectedList=" + expectedList);
        System.out.println("result=" + result);
        Assertions.assertEquals(expectedList, result);

    }


}
