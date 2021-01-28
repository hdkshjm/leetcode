package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3619;

class Solution {
    public String getSmallestString(int n, int k) {
        int remain = k - n;
        int mod = remain % 25;
        int div = remain / 25;

        char[] array = new char[n];
        for (int i = 0; i < n; i++) {
            if (i == n - 1 - div) {
                // 'a' - 97 = 0
                array[i] = (char)(97 + mod);
                continue;
            }
            if (i > n - 1 - div) {
                array[i] = 'z';
                continue;
            }
            array[i] = 'a';
        }

        return new String(array);
    }
}
