package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0668;

class Solution {
    public int findKthNumber(int m, int n, int k) {
        int max = m * n;
        int min = 1;
        while (max > min) {
            int mid = (max + min) / 2;
            int numOfSmall = 0;
            for (int i = 1; i <= m; i++) numOfSmall += Math.min(mid / i, n);
            if (numOfSmall >= k) max = mid;
            else min = mid + 1;
        }
        return min;
    }
}
