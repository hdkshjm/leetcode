package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0476;

class Solution {
    public int findComplement(int num) {
        int ret = 0;
        for (char c : Integer.toBinaryString(num).toCharArray()) ret = ret * 2 + 1 + (int) ('0' - c);
        return ret;
    }
}
