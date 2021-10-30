package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0994;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int orangesRotting(int[][] grid) {
        List<int[]> freshOranges = new ArrayList<>();
        List<int[]> newRottenOranges = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) freshOranges.add(new int[]{i, j});
            }
        }

        int count = 0;
        while (!freshOranges.isEmpty()) {
            for (int i = 0; i < freshOranges.size(); i++) {
                if (canBeRotten(grid, freshOranges.get(i))) newRottenOranges.add(freshOranges.get(i));
            }
            if (newRottenOranges.isEmpty()) return -1;
            for (int[] position : newRottenOranges) {
                grid[position[0]][position[1]] = 2;
                freshOranges.remove(position);
            }
            newRottenOranges.clear();
            count++;
        }
        return count;
    }

    public boolean canBeRotten(int[][] grid, int[] position) {
        int[][] direction = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        for (int k = 0; k < direction.length; k++) {
            int x = position[0] + direction[k][0];
            int y = position[1] + direction[k][1];
            if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) continue;
            if (grid[x][y] == 2) return true;
        }
        return false;
    }
}
