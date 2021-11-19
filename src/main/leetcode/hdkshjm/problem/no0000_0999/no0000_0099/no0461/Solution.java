package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0461;

class Solution {
    public int hammingDistance(int x, int y) {
        int xor = y^x;
        int ret = 0;
        while(xor >0){
            ret += xor % 2;
            xor /= 2;
        }
        return ret;
    }
}
