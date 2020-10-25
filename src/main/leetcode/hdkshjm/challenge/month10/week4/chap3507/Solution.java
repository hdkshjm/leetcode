package leetcode.hdkshjm.challenge.month10.week4.chap3507;

class Solution {
    public boolean winnerSquareGame(int n) {
        // If results is Map<Integer, Boolean>, the Runtime is 36ms.
        Boolean[] results = new Boolean[n];
        int squareRoot = (int) Math.sqrt(n);
        while (squareRoot > 0) {
            results[squareRoot * squareRoot - 1] = true;
            squareRoot--;
        }

        return winnerSquareGame(n, results);
    }

    public boolean winnerSquareGame(int n, Boolean[] results) {
        if (results[n - 1] != null) return results[n - 1];

        int squareRoot = (int) Math.sqrt(n);
        while (squareRoot > 0) {
            if (!winnerSquareGame(n - squareRoot * squareRoot, results)) {
                results[n - 1] = true;
                return true;
            }
            squareRoot--;
        }
        results[n - 1] = false;
        return false;
    }
}
