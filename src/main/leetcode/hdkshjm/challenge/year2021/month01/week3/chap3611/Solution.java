package leetcode.hdkshjm.challenge.year2021.month01.week3.chap3611;

import java.util.Stack;

class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            while (nums.length - i > k - stack.size() && !stack.isEmpty() && stack.peek() > nums[i]) {
                stack.pop();
            }
            if (stack.size() < k) {
                stack.push(nums[i]);
            }
        }

        int[] ret = new int[k];
        for (int i = ret.length - 1; i >= 0; i--) {
            ret[i] = stack.pop();
        }
        return ret;
    }
}
