package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3614;

import java.util.Arrays;

class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int[] array = new int[mat.length * mat[0].length];

        int i = mat.length - 1;
        int j = 0;
        int k = 0;
        int start = 0;
        while (i <= mat.length && j <= mat[0].length) {
            array[k] = mat[i][j];
            k++;

            // 一番右上
            if (i == 0 && j == mat[0].length - 1) break;

            // 一番下 or 右端(一番右上は除く)
            if (i == mat.length - 1 || j == mat[0].length - 1) {
                Arrays.sort(array, start, k);
                start = k;

                if (i > j) {
                    i = i - j - 1;
                    j = 0;
                } else {
                    j = j - i + 1;
                    i = 0;
                }
                continue;
            }

            i++;
            j++;
        }


        int[][] ret = new int[mat.length][mat[0].length];
        i = ret.length - 1;
        j = 0;
        k = 0;
        while (i <= ret.length && j <= ret[0].length) {
            ret[i][j] = array[k];
            k++;

            if (i == 0 && j == ret[0].length - 1) break;


            if (i == ret.length - 1 || j == ret[0].length - 1) {
                if (i > j) {
                    i = i - j - 1;
                    j = 0;
                } else {
                    j = j - i + 1;
                    i = 0;
                }
                continue;
            }

            i++;
            j++;
        }

        return ret;
    }
}
