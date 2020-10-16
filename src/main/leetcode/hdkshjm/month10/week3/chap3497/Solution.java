package leetcode.hdkshjm.month10.week3.chap3497;

import java.util.Arrays;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }

        int end = matrix[0].length;
        for (int[] array : matrix) {
            int newEnd = Arrays.binarySearch(array, 0, end, target);
            if (newEnd == end) {
                return false;
            }
            if (newEnd >= 0) {
                return true;
            }
            if (newEnd < 0) {
                end = ~newEnd;
            }
        }
        return false;
    }
}