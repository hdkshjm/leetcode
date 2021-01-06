package leetcode.hdkshjm.challenge.year2021.month01.week1.chap3594;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 1;
        int i = 0;
        while (k > 0) {
            if (num != arr[i]) k--;
            else if (i < arr.length - 1) i++;
            num++;
        }
        return num - 1;
    }
}
