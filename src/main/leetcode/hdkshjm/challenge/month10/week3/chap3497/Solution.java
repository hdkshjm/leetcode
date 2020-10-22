package leetcode.hdkshjm.challenge.month10.week3.chap3497;

class Solution {
    int mLength;
    int nLength;
    int[][] matrix;

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        this.matrix = matrix;
        mLength = matrix.length;
        nLength = matrix[0].length;

        int start = 0;
        int end = mLength * nLength - 1;
        int center;
        while (end - start > 2) {
            center = (end - start) / 2 + start;
            if (get(center) < target) {
                start = center;
            } else if (get(center) == target) {
                return true;
            } else {
                end = center;
            }
        }
        for (int i = start; i <= end; i++) {
            if (get(i) == target)
                return true;
        }
        return false;
    }

    private int get(int i) {
        int m = i / nLength;
        int n = i % nLength;
        return matrix[m][n];
    }
}
