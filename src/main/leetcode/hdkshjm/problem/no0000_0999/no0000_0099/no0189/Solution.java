package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0189;

class Solution {
    public void rotate(int[] nums, int k) {
        int start = 0;
        int previous = nums[start];
        int cur = 0;

        for (int j = 0; j < nums.length; j++) {
            cur = (cur + k) % nums.length;
            int tmp = nums[cur];
            nums[cur] = previous;
            previous = tmp;

            if (cur == start) {
                cur = (cur + 1 + nums.length) % nums.length;
                start = (start + 1) % nums.length;
                previous = nums[start];
            }
        }
    }
}
