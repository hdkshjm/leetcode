package leetcode.hdkshjm.challenge.year2020.month11.week1.chap3520;

class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        for (int p : position) {
            if (p % 2 == 0) even++;
        }
        return Math.min(even, position.length - even);
    }
}
