package leetcode.hdkshjm.challenge.year2020.month10.week1.chap3482;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class SolutionStream {
    public int findPairs(int[] nums, int k) {
        List<Integer> numsList = Arrays.stream(nums).sorted().boxed().collect(Collectors.toList());

        if (k == 0) {
            return (int) numsList.stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream().filter(x -> x.getValue() > 1).count();
        }


        return (int) numsList.stream().distinct().
                filter(i -> Collections.frequency(numsList, i + k) > 0).count();
    }
}