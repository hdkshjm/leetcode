package leetcode.hdkshjm.month10.week3.chap3496;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) return;

        int loop = 0;
        int maxShift = 0;
        for (int i = 1; i <= k; i++) {
            if ((nums.length * i) % k == 0) {
                maxShift = (nums.length * i) / k;
                loop = nums.length / maxShift;
                break;
            }
        }

        for (int i = 0; i < loop; i++) {
            int previous = nums[(nums.length + i - k) % nums.length];
            for (int j = 0; j < maxShift; j++) {
                int from = (nums.length + i + j * k) % nums.length;
                int temp = nums[from];
                nums[from] = previous;
                previous = temp;
            }
        }
    }
}