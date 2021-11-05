package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0441;

class Solution {
    public int arrangeCoins(int n) {
        long left = (long) Math.pow(2 * (long) n + 1, 0.5) - 1;
        long right = left * 2 + 2;

        while (left + 1 < right) {
            long mid = (left + right) / 2;
            long total = mid * (mid + 1) / 2;
            if (total < n) left = mid;
            else if (total > n) right = mid;
            else return (int) mid;
        }
        return (int) left;
    }
}
