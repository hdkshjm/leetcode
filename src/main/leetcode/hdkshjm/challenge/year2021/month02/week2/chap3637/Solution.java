package leetcode.hdkshjm.challenge.year2021.month02.week2.chap3637;

class Solution {
    public int numberOfSteps(int num) {
        if (num == 0) return 0;
        return 31 - Integer.numberOfLeadingZeros(num) + Integer.bitCount(num);
    }
}
