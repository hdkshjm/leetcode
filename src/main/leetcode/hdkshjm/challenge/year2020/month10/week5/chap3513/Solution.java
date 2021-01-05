package leetcode.hdkshjm.challenge.year2020.month10.week5.chap3513;

class Solution {
    public int findNumberOfLIS(int[] nums) {
        if (nums.length == 0) return 0;

        // results[i][0] = length
        // results[i][1] = count
        // If results is Map<Integer, Integer[]>, Runtime are 86 ms.
        int[][] results = new int[nums.length][2];

        results[0] = new int[]{0, 1};
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                results[i] = results[i - 1];
                continue;
            }

            int[] result = new int[]{0, 1};
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (result[0] == results[j][0] + 1) {
                        result[1] += results[j][1];
                        continue;
                    }
                    if (result[0] < results[j][0] + 1) {
                        result[0] = results[j][0] + 1;
                        result[1] = results[j][1];
                    }
                }
            }
            results[i] = result;
        }

        int maxLength = 0;
        int count = 0;
        for (int[] result : results) {
            if (maxLength < result[0]) {
                maxLength = result[0];
                count = result[1];
                continue;
            }
            if (maxLength == result[0]) {
                count += result[1];
            }
        }
        return count;
    }
}
