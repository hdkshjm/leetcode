package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0221;

class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] histo = new int[matrix.length][matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == '1') histo[0][j] = 1;
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') histo[i][j] = histo[i - 1][j] + 1;
            }
        }

        int area = 0;
        for (int i = 0; i < histo.length; i++) {
            for (int j = 0; j < histo[0].length; j++) {
                area = Math.max(area, calculateArea(histo[i], j));
            }
        }
        return area;
    }

    private int calculateArea(int[] row, int start) {
        if (row[start] == 0) return 0;

        int area = 0;
        int min = row[start];
        for (int i = start; i < row.length; i++) {
            if (row[i] == 0) break;
            min = Math.min(min, row[i]);
            int slideLength = Math.min(min, i - start + 1);
            area = Math.max(area, slideLength * slideLength);
        }
        return area;
    }
}
