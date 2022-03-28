package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0081;

class Solution {
    public boolean search(int[] nums, int target) {
        if (nums.length == 1) return nums[0] == target;

        int low = 0;
        int high = nums.length - 1;

        int k = findRotateK(nums, low, high);
        if (k == -1) return search(nums, low, high, target);

        boolean first = search(nums, low, k - 1, target);
        if (first) return true;
        return search(nums, k, high, target);
    }

    public int findRotateK(int[] nums, int low, int high) {
        if (high - low == 1) {
            if (nums[low] > nums[high]) return high;
            else return -1;
        }

        int mid = low + (high - low) / 2;
        if (nums[mid] > nums[mid + 1]) return mid + 1;
        int index = findRotateK(nums, low, mid);
        if (index != -1) return index;
        return findRotateK(nums, mid, high);
    }

    private boolean search(int[] nums, int low, int high, int target) {
        if (target < nums[low] || target > nums[high]) return false;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (target < nums[mid]) high = mid;
            else if (nums[mid] < target) low = mid + 1;
            else return true;
        }
        return target == nums[low];
    }
}
