package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0704;

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        if (target < nums[low] || target > nums[high]) return -1;

        while (low < high) {
            int mid = low + (high - low )/ 2;
            if (target < nums[mid]) high = mid;
            else if (nums[mid] < target) low = mid + 1;
            else return mid;
        }

        return target == nums[low] ? low : -1;
    }
}
