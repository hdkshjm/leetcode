package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0799;

class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[] glasses = new double[1];
        glasses[0] = poured;
        for (int i = 0; i < query_row; i++) glasses = champagneTower(glasses);

        if (glasses[query_glass] > 1) return 1;
        else return glasses[query_glass];
    }

    public double[] champagneTower(double[] glasses) {
        double[] ret = new double[glasses.length + 1];
        if (glasses[0] > 1) ret[0] += (glasses[0] - 1) / 2;
        for (int i = 1; i < ret.length - 1; i++) {
            if (glasses[i - 1] > 1) ret[i] += (glasses[i - 1] - 1) / 2;
            if (glasses[i] > 1) ret[i] += (glasses[i] - 1) / 2;
        }
        if (glasses[glasses.length - 1] > 1) ret[ret.length - 1] += (glasses[glasses.length - 1] - 1) / 2;
        return ret;
    }

}
