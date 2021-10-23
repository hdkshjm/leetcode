package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0154;

class Solution {
    //0ms
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (right > left) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right]) right = mid;
            else if (nums[mid] > nums[right]) left = mid + 1;
            else right--;
        }
        return nums[left];
    }

    //1ms
    public int findMin2(int[] nums) {
        int n = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                n = nums[i + 1];
                break;
            }
        }
        return n;
    }
}
