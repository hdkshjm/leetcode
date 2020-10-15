package leetcode.hdkshjm.month10.week3.chap3496;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        int[] rotateArray = new int[nums.length - k];
        for (int i = 0; i < nums.length - k; i++) {
            rotateArray[i] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            int targetIndex = i + nums.length - k;
            int temp = nums[i];
            nums[i] = nums[targetIndex];
        }

        for (int i = k; i < nums.length; i++) {
            nums[i] = rotateArray[i - k];
        }
    }
}