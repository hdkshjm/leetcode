package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0201;

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if (Integer.highestOneBit(left) == Integer.highestOneBit(right)) {
            int ret = left;
            for (int i = left; i != Integer.MAX_VALUE && i <= right; i++) ret = ret & i;
            return ret;
        }
        return 0;
    }
}
