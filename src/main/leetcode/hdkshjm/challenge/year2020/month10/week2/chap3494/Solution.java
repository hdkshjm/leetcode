package leetcode.hdkshjm.challenge.year2020.month10.week2.chap3494;

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int max = robMoeny(nums, 0);
        int shiftMax = robMoeny(nums, 1);

        return Math.max(max, shiftMax);
    }

    public int robMoeny(int[] nums, int start) {
        int currentMax = 0;
        int previousMax = 0;

        boolean isCurrentRobbedLastHouse = false;
        boolean isPreviousRobbedLastHouse = false;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 && isPreviousRobbedLastHouse) {
                break;
            }

            int sum;
            if (i + start < nums.length) {
                sum = previousMax + nums[i + start];
            } else {
                sum = previousMax + nums[i + start - nums.length];
            }
            int tempMax = currentMax;
            boolean tempIsRobbed = isCurrentRobbedLastHouse;
            if (sum >= currentMax) {
                currentMax = sum;
                if (i == 0) {
                    isCurrentRobbedLastHouse = true;
                } else {
                    isCurrentRobbedLastHouse = isPreviousRobbedLastHouse;
                }
            }
            previousMax = tempMax;
            isPreviousRobbedLastHouse = tempIsRobbed;
        }
        return currentMax;
    }
}