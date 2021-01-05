package leetcode.hdkshjm.challenge.year2020.month10.week1.chap3484;

class Solution {

    public int bitwiseComplement(int N) {
        if (N == 0) {
            return 1;
        }

        int ret = 0;
        int shift = 1;
        while (N > 0) {
            if ((N % 2) == 0) {
                ret = ret + shift;
            }
            N = N >> 1;
            shift = shift << 1;
        }
        return ret;
    }
}