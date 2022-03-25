package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0991;

class Solution {
    public int brokenCalc(int startValue, int target) {
        int count = 0;
        int val = target;
        while (startValue < val) {
            count++;
            if (val % 2 == 0) {
                val /= 2;
            } else {
                val++;
            }
        }
        return count + startValue - val;
    }
}
