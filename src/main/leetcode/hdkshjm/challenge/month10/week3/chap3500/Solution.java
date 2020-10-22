package leetcode.hdkshjm.challenge.month10.week3.chap3500;

class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        if (A.length == 0 || B.length == 0) {
            return -1;
        }

        int countOfA[] = new int[6];
        int countOfB[] = new int[6];
        int targetOfA = A[0];
        int targetOfB = B[0];
        for (int i = 0; i < A.length; i++) {
            if (targetOfA != A[i] && targetOfA != B[i]) {
                targetOfA = -1;
            }
            if (targetOfB != A[i] && targetOfB != B[i]) {
                targetOfB = -1;
            }
            if (targetOfA == -1 && targetOfB == -1) {
                return -1;
            }
            countOfA[A[i] - 1]++;
            countOfB[B[i] - 1]++;
        }

        int target = targetOfA - 1;
        if (targetOfA == -1) {
            target = targetOfB - 1;
        }
        return Math.min(A.length - countOfA[target], B.length - countOfB[target]);
    }
}