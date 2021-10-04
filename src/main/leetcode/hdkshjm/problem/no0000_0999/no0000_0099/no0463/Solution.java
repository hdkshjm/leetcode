package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0463;

class Solution {
    // 5ms
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        int previous = 0;
        for (int j = 0; j < grid[0].length; j++) {
            perimeter += grid[0][j] * 4;
            perimeter -= 2 * (grid[0][j] & previous);
            previous = grid[0][j];
        }

        for (int i = 1; i < grid.length; i++) {
            perimeter += grid[i][0] * 4;
            perimeter -= 2 * (grid[i][0] & grid[i - 1][0]);

            for (int j = 1; j < grid[0].length; j++) {
                perimeter += grid[i][j] * 4;
                perimeter -= 2 * (grid[i][j] & grid[i - 1][j]);
                perimeter -= 2 * (grid[i][j] & grid[i][j - 1]);
            }
        }

        return perimeter;
    }

    // 10ms
    public int islandPerimeter2(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                perimeter += grid[i][j] * 4;
                if (i > 0) perimeter -= 2 * (grid[i][j] & grid[i - 1][j]);
                if (j > 0) perimeter -= 2 * (grid[i][j] & grid[i][j - 1]);
            }
        }

        return perimeter;
    }
}
