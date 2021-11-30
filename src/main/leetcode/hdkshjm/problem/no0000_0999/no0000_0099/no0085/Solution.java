package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0085;

class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int[][] histo = new int[matrix.length][matrix[0].length];
        for (int j = 0; j < histo[0].length; j++) {
            if (matrix[0][j] == '1') histo[0][j] = 1;
        }
        for (int i = 1; i < histo.length; i++) {
            for (int j = 0; j < histo[0].length; j++) {
                if (matrix[i][j] == '0') histo[i][j] = 0;
                else histo[i][j] = histo[i - 1][j] + 1;
            }
        }

        int area = 0;
        for (int i = 0; i < histo.length; i++) {
            for (int j = 0; j < histo[0].length; j++) {
                area = Math.max(area, calculate(histo[i], j));
            }
        }
        return area;
    }

    private int calculate(int[] row, int start) {
        if (row[start] == 0) return 0;

        int area = 0;
        int min = row[start];
        for (int i = start; i < row.length; i++) {
            if (row[i] == 0) break;
            min = Math.min(min, row[i]);
            area = Math.max(area, min * (i - start+1));
        }
        return area;
    }
}
