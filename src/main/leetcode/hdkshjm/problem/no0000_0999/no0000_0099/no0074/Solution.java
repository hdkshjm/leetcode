package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0074;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int high = m * matrix.length;
        int low = 0;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int val = matrix[mid / m][mid % m];
            if (val == target) return true;
            if (val < target) {
                low = mid + 1;
                continue;
            }
            high = mid;
        }
        if (low >= m * matrix.length) low = m * matrix.length - 1;
        return matrix[low / m][low % m] == target ? true : false;
    }
}
