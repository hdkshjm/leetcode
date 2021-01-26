package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3617;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int minimumEffortPath(int[][] heights) {
        int ROW_MAX = heights.length;
        int COL_MAX = heights[0].length;

        int[][] differences = new int[ROW_MAX][COL_MAX];
        for (int[] row : differences) Arrays.fill(row, Integer.MAX_VALUE);
        differences[0][0] = 0;
        boolean[][] visited = new boolean[ROW_MAX][COL_MAX];

        // {row, col, diff}
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a, b) -> (a[2] - b[2]));
        queue.add(new int[]{0, 0, differences[0][0]});

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int x = node[0];
            int y = node[1];
            visited[x][y] = true;

            int[][] directions = new int[][]{{0, -1}, {0, 1}, {1, 0}, {-1, 0}};

            for (int[] direction : directions) {
                int toX = x + direction[0];
                int toY = y + direction[1];
                if (toX < 0 || toX >= ROW_MAX || toY < 0 || toY >= COL_MAX || visited[toX][toY])
                    continue;

                // 参考 http://www.deqnotes.net/acmicpc/dijkstra/
                int diff = Math.max(Math.abs(heights[toX][toY] - heights[x][y]), differences[x][y]);
                if (differences[toX][toY] > diff) {
                    differences[toX][toY] = diff;
                    queue.add(new int[]{toX, toY, diff});
                }
            }
        }
        return differences[ROW_MAX - 1][COL_MAX - 1];
    }
}
