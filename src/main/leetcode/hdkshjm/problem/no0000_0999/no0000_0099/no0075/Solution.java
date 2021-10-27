package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0075;

class Solution {
    public void sortColors(int[] nums) {
        int[] counts = new int[4];

        for (int n : nums) counts[n + 1]++;
        for (int i = 0; i < counts.length - 1; i++) counts[i + 1] += counts[i];

        for (int i = 0; i < counts.length - 1; i++) {
            for (int j = counts[i]; j < counts[i + 1]; j++) nums[j] = i;
        }
    }
}
