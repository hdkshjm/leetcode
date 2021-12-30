package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1015;

class Solution {
    public int smallestRepunitDivByK(int k) {
        int mod = 0;
        for (int i = 0; i < k; i++) {
            mod = (mod * 10 + 1) % k;
            if (mod == 0) return i + 1;
        }
        return -1;
    }
}
