package leetcode.hdkshjm.month10.week2.chap3494;

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int max = robMoeny(nums);

        int[] shiftNums = new int[nums.length];
        System.arraycopy(nums, 1, shiftNums, 0, nums.length - 1);
        shiftNums[nums.length - 1] = nums[0];
        int shiftMax = robMoeny(shiftNums);

        return Math.max(max, shiftMax);
    }

    public int robMoeny(int[] nums) {
        int currentMax = 0;
        int previousMax = 0;

        boolean isCurrentRobbedLastHouse = false;
        boolean isPreviousRobbedLastHouse = false;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 && isPreviousRobbedLastHouse) {
                break;
            }

            int tempMax = currentMax;
            boolean tempIsRobbed = isCurrentRobbedLastHouse;
            if (previousMax + nums[i] >= currentMax) {
                currentMax = previousMax + nums[i];
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