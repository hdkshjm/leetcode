package leetcode.hdkshjm.challenge.year2020.month10.week4.chap3508;

class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        if (poured == 0) return 0;

        double[][] glasses = new double[query_row + 1][];
        glasses[0] = new double[1];
        glasses[0][0] = poured;

        for (int i = 1; i < glasses.length; i++) {
            glasses[i] = new double[i + 1];
            for (int j = 0; j < glasses[i].length; j++) {
                if (j - 1 >= 0 && glasses[i - 1][j - 1] > 1) {
                    glasses[i][j] += (glasses[i - 1][j - 1] - 1) / 2;
                }
                if (j < i && glasses[i - 1][j] > 1) {
                    glasses[i][j] += ((glasses[i - 1][j] - 1) / 2);
                }
            }
        }
        return Math.min(1, glasses[query_row][query_glass]);
    }
}
