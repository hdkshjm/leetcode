package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0136;

class Solution {
    public int singleNumber(int[] nums) {
        int ret = 0;
        // A ^ ( B ^ C ) = A ^ C ^ B
        // A ^ B ^ C ... ^ A ^ ..  ^ B ^ ...^ C = A ^ A ^ B ^ B ^ C .... = Z(only 1 time val)
        for(int n:nums) ret ^= n;
        return ret;
    }
}
