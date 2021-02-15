package leetcode.hdkshjm.challenge.year2021.month02.week3.chap3641;

import java.util.PriorityQueue;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        // int position {num of soldiers, i of row}
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a, b) ->
                (a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]));

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int people : mat[i]) {
                if (people == 0) break;
                count++;
            }
            queue.add(new int[]{count, i});
        }

        int[] ret = new int[k];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = queue.poll()[1];
        }
        return ret;
    }
}
