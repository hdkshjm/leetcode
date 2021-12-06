package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1217;

class Solution {
    public int minCostToMoveChips(int[] position) {
        int numOfOdd = 0;
        int numOfEven = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) numOfEven++;
            else numOfOdd++;
        }
        return Math.min(numOfEven, numOfOdd);
    }
}
