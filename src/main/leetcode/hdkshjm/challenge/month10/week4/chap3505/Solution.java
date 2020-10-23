package leetcode.hdkshjm.challenge.month10.week4.chap3505;

import java.util.*;

class Solution {
    public boolean find132pattern(int[] nums) {
        int[] minNumsFromStart = new int[nums.length];
        minNumsFromStart[0] = nums[0];
        for (int i = 1; i < minNumsFromStart.length; i++) {
            minNumsFromStart[i] = Math.min(minNumsFromStart[i - 1], nums[i]);
        }

        TreeSet<Integer> set = new TreeSet<>();
        set.add(nums[nums.length -1]);
        for (int j = nums.length -2 ; j >= 0 ; j--) {
            Integer kOfNums = set.lower(nums[j]);
            set.add(nums[j]);
            if( kOfNums == null ) continue;
            if( minNumsFromStart[j] < kOfNums  && kOfNums < nums[j]  ){
                return true;
            }
         }
        return false;
    }
}
