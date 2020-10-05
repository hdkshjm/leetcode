package leetcode.hdkshjm.month11.week1.chap3484;

class Solution {

    public int bitwiseComplement(int N) {
        int ret = 0;

        if (N == 0) {
            return 1;
        }

        String bin = "";
        while (N > 0) {
            int mod = N % 2;
            ret = ret << 1;
            if (mod == 0) {
                bin = "1" + bin;
            } else {
                bin = "0" + bin;
            }
            N = N >> 1;
        }
        return Integer.parseInt(bin, 2);
    }
}