package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0035;

import java.util.Arrays;

class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) return nums.length;
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    public int searchInsert2(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        return index >= 0 ? index : -index - 1;
    }
}
