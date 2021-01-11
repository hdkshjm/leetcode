package leetcode.hdkshjm.challenge.year2021.month01.week2.chap3600;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copiedNums1 = new int[m];
        System.arraycopy(nums1, 0, copiedNums1, 0, m);

        int p = 0;
        int q = 0;
        while (p < m && q < n) {
            if (copiedNums1[p] <= nums2[q]) {
                nums1[p + q] = copiedNums1[p];
                p++;
                continue;
            }
            nums1[p + q] = nums2[q];
            q++;
        }
        if (p < m) System.arraycopy(copiedNums1, p, nums1, p + q, m + n - p - q);
        if (q < n) System.arraycopy(nums2, q, nums1, p + q, m + n - p - q);
    }
}
