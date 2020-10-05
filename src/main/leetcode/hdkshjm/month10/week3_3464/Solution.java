package leetcode.hdkshjm.month10.week3_3464;

class Solution {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int[] maxPrices = new int[prices.length];
        int max = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            max = Math.max(prices[i], max);
            maxPrices[i] = max;
        }

        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, maxPrices[i] - minPrice);
        }
        return maxProfit;
    }
}
