package leetcode.hdkshjm.problem.no1000_1999.no1663;

class Solution {
    public String getSmallestString(int n, int k) {
        int numOfZ = (k - n) / 25;
        k -= numOfZ * 26;

        char[] array = new char[n];
        for (int i = 0; i < n - numOfZ - 1; i++) array[i] = 'a';
        int index = n - numOfZ - 1;
        if (index < 0) {
            index = 0;
        } else {
            array[index] = (char) ('a' + k - n + numOfZ);
            index++;
        }
        for (int i = index; i < n; i++) array[i] = 'z';
        return new String(array);
    }
}
