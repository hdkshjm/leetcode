package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0039;

import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return combinationSum(candidates, 0, target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int start, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) break;
            if (candidates[i] == target) {
                List<Integer> list = new ArrayList<>();
                list.add(candidates[i]);
                ret.add(list);
                break;
            }

            List<List<Integer>> lists = combinationSum(candidates, i, target - candidates[i]);
            for (List<Integer> list : lists) {
                list.add(0, candidates[i]);
                ret.add(list);
            }
        }
        return ret;
    }
}
