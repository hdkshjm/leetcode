package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0079;

class Solution {
    public boolean exist(char[][] board, String word) {
        int[][] direction = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        char[] array = word.toCharArray();

        boolean[][] checked = new boolean[board.length][board[0].length];
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[0].length; y++) {
                if (find(board, x, y, direction, array, 0, checked)) return true;
            }
        }
        return false;
    }

    public boolean find(char[][] board, int x, int y, int[][] direction, char[] array, int index, boolean[][] checked) {
        if (board[x][y] != array[index]) return false;
        if (index == array.length - 1) return true;

        checked[x][y] = true;
        for (int k = 0; k < direction.length; k++) {
            int nextX = x + direction[k][0];
            int nextY = y + direction[k][1];
            if (nextX < 0 || nextX >= board.length || nextY < 0 || nextY >= board[0].length || checked[nextX][nextY])
                continue;
            if (find(board, nextX, nextY, direction, array, index + 1, checked)) return true;
        }
        checked[x][y] = false;
        return false;
    }
}
