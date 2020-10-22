package leetcode.hdkshjm.challenge.month10.week1.chap3481;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        ArrayDeque<ArrayDeque<Integer>> queue = new ArrayDeque<ArrayDeque<Integer>>();
        for (int c : candidates) {
            ArrayDeque<Integer> newCombination = new ArrayDeque<Integer>();
            int remain = target - c;
            if (remain < 0) {
                break;
            }
            
            newCombination.addFirst(target - c);// index=0には残りをいれる
            newCombination.addLast(c);
            queue.add(newCombination);
        }

        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        while (!queue.isEmpty()) {
            ArrayDeque<Integer> combination = queue.poll();

            int remain = combination.getFirst();
            if (remain == 0) {
                combination.removeFirst();
                ret.add(new ArrayList<Integer>(combination));
                continue;
            }

            for (int c : candidates) {
                if (c < combination.getLast()) {
                    continue;
                }
                if (remain - c < 0) {
                    break;
                }
                
                ArrayDeque<Integer> newCombination = new ArrayDeque<Integer>(combination);
                newCombination.removeFirst();
                newCombination.addFirst(remain - c);
                newCombination.addLast(c);

                queue.addFirst(newCombination);
            }
        }
        return ret;
    }

}