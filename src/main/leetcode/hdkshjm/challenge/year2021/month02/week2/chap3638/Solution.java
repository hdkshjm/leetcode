package leetcode.hdkshjm.challenge.year2021.month02.week2.chap3638;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) return -1;

        int ROW_MAX = grid.length;
        int COL_MAX = grid[0].length;
        int MAX_LENGTH = ROW_MAX * COL_MAX + 1;

        // int position {x, y, length}
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a, b) -> (a[2] - b[2]));
        int[][] directions = new int[][]{{-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}};
        boolean[][] visited = new boolean[ROW_MAX][COL_MAX];

        int[][] lengths = new int[ROW_MAX][COL_MAX];
        for (int[] row : lengths) Arrays.fill(row, MAX_LENGTH);
        lengths[0][0] = 1;

        queue.add(new int[]{0, 0, lengths[0][0]});
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int x = node[0];
            int y = node[1];
            visited[x][y] = true;

            for (int[] direction : directions) {
                int toX = x + direction[0];
                int toY = y + direction[1];
                if (toX < 0 || toX >= ROW_MAX || toY < 0 || toY >= COL_MAX
                        || visited[toX][toY] || grid[toX][toY] == 1)
                    continue;

                // 参考 http://www.deqnotes.net/acmicpc/dijkstra/
                if (lengths[toX][toY] > lengths[x][y] + 1) {
                    lengths[toX][toY] = lengths[x][y] + 1;
                    queue.add(new int[]{toX, toY, lengths[x][y] + 1});
                }
            }
        }

        return lengths[ROW_MAX - 1][COL_MAX - 1] == MAX_LENGTH ? -1 : lengths[ROW_MAX - 1][COL_MAX - 1];
    }
}
