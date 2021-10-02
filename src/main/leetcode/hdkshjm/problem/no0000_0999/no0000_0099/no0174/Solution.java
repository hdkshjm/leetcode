package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0174;

class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int rowMax = dungeon.length;
        int colMax = dungeon[0].length;

        int[][] dist = new int[rowMax][colMax];
        boolean[][] checked = new boolean[rowMax][colMax];
        dist[rowMax - 1][colMax - 1] = 1 - Math.min(dungeon[rowMax - 1][colMax - 1], 0);
        checked[rowMax - 1][colMax - 1] = true;
        search(dungeon, checked, dist, 0, 0);
        return dist[0][0];
    }

    public void search(int[][] dungeon, boolean[][] checked, int[][] dist, int i, int j) {
        if (i >= dungeon.length || j >= dungeon[0].length || checked[i][j]) return;

        int right = Integer.MAX_VALUE;
        if (i < dungeon.length - 1) {
            search(dungeon, checked, dist, i + 1, j);
            checked[i + 1][j] = true;
            right = Math.min(right, dist[i + 1][j]);
        }
        int down = Integer.MAX_VALUE;
        if (j < dungeon[0].length - 1) {
            search(dungeon, checked, dist, i, j + 1);
            checked[i][j + 1] = true;
            down = Math.min(down, dist[i][j + 1]);
        }

        int currentHealth = Math.min(down, right);
        if (currentHealth > dungeon[i][j]) dist[i][j] = currentHealth - dungeon[i][j];
        else dist[i][j] = 1;
    }
}
