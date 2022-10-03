package leetcode.hdkshjm.problem.no1000_1999.no1007;

class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] dominoCount = new int[6];
        for (int i = 0; i < tops.length; i++) {
            dominoCount[tops[i] - 1]++;
            dominoCount[bottoms[i] - 1]++;
        }

        int target = 0;
        int max = 0;
        for (int i = 0; i < dominoCount.length; i++) {
            if (max < dominoCount[i]) {
                target = i + 1;
                max = dominoCount[i];
            }
        }

        int topsCount = 0;
        int bottomsCount = 0;
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != target && bottoms[i] != target) return -1;
            if (tops[i] == target) topsCount++;
            if (bottoms[i] == target) bottomsCount++;
        }

        return Math.min(
                Math.min(topsCount, tops.length - topsCount),
                Math.min(bottomsCount, bottoms.length - bottomsCount)
        );
    }
}
