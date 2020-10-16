package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0004;

import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int length = nums1.length + nums2.length;
        while (i < nums1.length || j < nums2.length) {
            if (list.size() > length / 2) {
                break;
            }

            if (i == nums1.length) {
                list.add(nums2[j]);
                j++;
                continue;
            }
            if (j == nums2.length) {
                list.add(nums1[i]);
                i++;
                continue;
            }

            if (nums1[i] >= nums2[j]) {
                list.add(nums2[j]);
                j++;
                continue;
            }
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                list.add(nums2[j]);
                j++;
                continue;
            }
            if (nums1[i] <= nums2[j]) {
                list.add(nums1[i]);
                i++;
                continue;
            }
        }

        if (length == 0) return 0;
        if (length % 2 == 0) return ((double) (list.get(length / 2 - 1) + list.get(length / 2))) / 2;
        return list.get((length - 1) / 2);
    }
}
