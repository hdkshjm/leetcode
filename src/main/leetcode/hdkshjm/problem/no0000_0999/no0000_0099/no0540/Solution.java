package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0540;

class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            // つねに high 〜 low と high 〜 mid の個数を奇数にするため
            mid -= mid % 2;
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
