package leetcode.hdkshjm.challenge.year2020.month11.week1.chap3518;

class Solution {
    public int maxPower(String s) {
        char previous = 'a' - 1;
        int count = 1;
        int max = 1;
        for (char c : s.toCharArray()) {
            if (previous == c) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 1;
            }
            previous = c;
        }
        max = Math.max(count, max);

        return max;
    }
}
