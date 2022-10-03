package leetcode.hdkshjm.problem.no1000_1999.no1446;

class Solution {
    public int maxPower(String s) {
        int max = 1;
        int current = 0;
        int previous = '0';

        for (char c : s.toCharArray()) {
            if (c == previous) {
                current++;
                max = Math.max(current, max);
            } else {
                current = 1;
                previous = c;
            }
        }

        return max;
    }
}
