package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0231;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return Integer.highestOneBit(n) == Integer.lowestOneBit(n);
    }
}
