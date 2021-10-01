package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1143;

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] array1 = text1.toCharArray();
        char[] array2 = text2.toCharArray();
        int[][] dist = new int[text1.length() + 1][text2.length() + 1];

        for (int i = array1.length - 1; i >= 0; i--) {
            for (int j = array2.length - 1; j >= 0; j--) {
                if (array1[i] == array2[j]) dist[i][j] = dist[i + 1][j + 1] + 1;
                else dist[i][j] = Math.max(dist[i + 1][j], dist[i][j + 1]);
            }
        }
        return dist[0][0];
    }
}
