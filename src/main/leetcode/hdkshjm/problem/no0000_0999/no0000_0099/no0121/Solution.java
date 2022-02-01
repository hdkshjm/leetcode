package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0121;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for(int p:prices){
            profit = Math.max(profit,p - min);
            min = Math.min(min , p);
        }
        return profit;
    }
}
