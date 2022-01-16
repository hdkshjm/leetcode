package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0849;

class Solution {
    public int maxDistToClosest(int[] seats) {
        int max = 0;

        int previousUsed = -1;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                max = Math.max(max, i);
                previousUsed = i;
                break;
            }
        }

        for (int i = previousUsed + 1; i < seats.length; i++) {
            if (seats[i] == 0) continue;
            max = Math.max(max, (i - previousUsed) / 2);
            previousUsed = i;
        }

        max = Math.max(max, seats.length - 1 - previousUsed);

        return max;
    }
}

