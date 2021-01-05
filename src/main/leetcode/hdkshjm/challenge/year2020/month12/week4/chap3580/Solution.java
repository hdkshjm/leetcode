package leetcode.hdkshjm.challenge.year2020.month12.week4.chap3580;

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];

        int[] ret = new int[matrix.length * matrix[0].length];

        int m = 0;
        int n = 0;
        // true: right-up, false:left-down
        boolean direction = true;
        for (int i = 0; i < ret.length; i++) {
            ret[i] = matrix[m][n];

            if (direction) {
                if (n == matrix[0].length - 1) {
                    direction = false;
                    m++;
                    continue;
                }

                n++;
                if (m == 0) direction = false;
                else m--;
                continue;
            }

            if (m == matrix.length - 1) {
                direction = true;
                n++;
                continue;
            }

            m++;
            if (n == 0) direction = true;
            else n--;

        }
        return ret;
    }
}
