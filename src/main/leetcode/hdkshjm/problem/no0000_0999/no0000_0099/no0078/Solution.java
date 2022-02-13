package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0078;

import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) indices.add(i);
        add(nums, -1, new Stack<>(), subsets);
        return subsets;
    }

    public void add(int[] nums, int index, Stack<Integer> current, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(current));
        if (current.size() == nums.length) return;
        for (int i = index + 1; i < nums.length; i++) {
            current.add(nums[i]);
            add(nums, i, current, subsets);
            current.pop();
        }
    }
}
