package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0130;

class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        replaceExceptBorder(board, 'O', '?');
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') check(board, i, 0);
            if (board[i][n - 1] == 'O') check(board, i, n - 1);
        }
        for (int j = 1; j < n - 1; j++) {
            if (board[0][j] == 'O') check(board, 0, j);
            if (board[m - 1][j] == 'O') check(board, m - 1, j);
        }
        replaceExceptBorder(board, '?', 'X');
    }

    public void replaceExceptBorder(char[][] board, char from, char to) {
        for (int i = 1; i < board.length - 1; i++)
            for (int j = 1; j < board[0].length - 1; j++) if (board[i][j] == from) board[i][j] = to;
    }

    public void check(char[][] board, int x, int y) {
        int[][] direction = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        for (int k = 0; k < direction.length; k++) {
            int nextX = x + direction[k][0];
            int nextY = y + direction[k][1];
            if (0 < nextX && nextX < board.length - 1 && 0 < nextY && nextY < board[0].length - 1 && board[nextX][nextY] == '?') {
                board[nextX][nextY] = 'O';
                check(board, nextX, nextY);
            }
        }
    }
}
