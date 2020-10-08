package leetcode.hdkshjm.month11.week2.chap3488;

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int center;

        while ( end - start > 2 ){
            center = (end - start) / 2 + start;

            if( nums[center] <  target) {
                start = center;
            } else if (nums[center] ==  target){
                return center;
            } else {
                end = center;
            }
        }

        for (int i = start; i <= end; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }
}
