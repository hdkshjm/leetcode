package leetcode.hdkshjm.problem.no1000_1999.no1009;

class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        return ((Integer.highestOneBit(n) << 1) - 1) ^ n;
    }

    public int bitwiseComplement2(int n) {
        int ret = 0;
        for (char c : Integer.toBinaryString(n).toCharArray()) ret = ret * 2 + ('1' - c);
        return ret;
    }
}
