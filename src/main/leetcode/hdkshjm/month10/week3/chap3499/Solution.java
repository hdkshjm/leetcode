package leetcode.hdkshjm.month10.week3.chap3499;

class Solution {
    public int maxProfit(int k, int[] prices) {
        if (k == 0 || prices.length == 0) {
            return 0;
        }

        if (2 * k > prices.length) {
            k = prices.length / 2 + 1;
        }

        int[] costs = new int[k];
        int[] profits = new int[k];
        for (int i = 0; i < k; i++) {
            costs[i] = Integer.MAX_VALUE;
        }

        for (int price : prices) {
            for (int i = 0; i < k; i++) {
                if (i == 0) {
                    costs[i] = Math.min(costs[i], price);
                } else {
                    costs[i] = Math.min(costs[i], price - profits[i - 1]);
                }
                profits[i] = Math.max(profits[i], price - costs[i]);
            }
        }
        return profits[k - 1];
    }
}
