package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1510;

class Solution {
    public boolean winnerSquareGame(int n) {
        Boolean[] results = new Boolean[n + 1];
        int root = (int) Math.sqrt(n);
        for (int i = root; i >= 1; i--) results[i * i] = true;
        return winnerSquareGame(n, results);
    }


    public boolean winnerSquareGame(int n, Boolean[] results) {
        if (results[n] != null) return results[n];
        int root = (int) Math.sqrt(n);
        for (int i = root; i >= 1; i--) {
            if (!winnerSquareGame(n - i * i, results)) {
                results[n] = true;
                return results[n];
            }
        }
        results[n] = false;
        return results[n];
    }
}
