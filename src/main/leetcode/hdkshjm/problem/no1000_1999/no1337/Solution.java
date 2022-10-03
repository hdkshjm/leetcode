package leetcode.hdkshjm.problem.no1000_1999.no1337;

import java.util.Arrays;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] ranks = new int[mat.length][2];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) ranks[i][0]++;
                else break;
            }
            ranks[i][1] = i;
        }

        Arrays.sort(ranks, (o1, o2) -> {
            if (o1[0] == o2[0]) return o1[1] - o2[1];
            else return o1[0] - o2[0];
        });

        int[] ret = new int[k];
        for (int i = 0; i < k; i++) ret[i] = ranks[i][1];
        return ret;
    }
}
