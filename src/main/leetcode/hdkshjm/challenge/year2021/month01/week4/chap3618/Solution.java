package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3618;

class Solution {
    public int concatenatedBinary(int n) {
        int MODULO = 1000000007;
        long ret = 0; // 計算してる時に桁溢れしちゃうので
        int shift = 0;
        for (int i = 1; i <= n; i++) {
            shift =  32 - Integer.numberOfLeadingZeros(i);
            ret = ((ret << shift) + i);
            if (ret > MODULO) ret %= MODULO;
        }
        return (int) ret;
    }
}
