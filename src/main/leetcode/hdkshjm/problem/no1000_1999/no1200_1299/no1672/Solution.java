package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1672;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int money = 0;
            for (int m : account) money += m;
            max = Math.max(max, money);
        }
        return max;
    }
}

