package leetcode.hdkshjm.challenge.year2020.month10.week5.chap3512;

class Solution {
    public int maxDistToClosest(int[] seats) {

        int[] maxEmptyInterval = new int[]{-1, -1};
        int[] interval = new int[]{-1, -1};
        int leftEmptyLength = -1;
        int rightEmptyLength = -1;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                if (interval[0] == -1) interval[0] = i;
                continue;
            }

            if (interval[0] != -1) {
                interval[1] = i - 1;
                if (interval[1] - interval[0] >= maxEmptyInterval[1] - maxEmptyInterval[0]) {
                    maxEmptyInterval[0] = interval[0];
                    maxEmptyInterval[1] = interval[1];
                }
                if (interval[0] == 0) leftEmptyLength = interval[1] - interval[0] + 1;
            }

            interval[0] = -1;
            interval[1] = -1;
        }

        if (interval[0] != -1) {
            interval[1] = seats.length - 1;
            if (interval[1] - interval[0] > maxEmptyInterval[1] - maxEmptyInterval[0]) {
                maxEmptyInterval[0] = interval[0];
                maxEmptyInterval[1] = interval[1];
            }
            if (interval[1] == seats.length - 1) rightEmptyLength = interval[1] - interval[0] + 1;
        }

        int max = (maxEmptyInterval[1] - maxEmptyInterval[0]) / 2 + 1;
        max = Math.max(max, leftEmptyLength);
        max = Math.max(max, rightEmptyLength);
        return max;
    }
}
