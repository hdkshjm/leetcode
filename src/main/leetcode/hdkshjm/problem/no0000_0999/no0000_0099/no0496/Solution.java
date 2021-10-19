package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0496;

import java.util.HashMap;
import java.util.Stack;
import java.util.Map;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // <x, the first greater element>
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> q = new Stack<>();
        for (int i = 0; i < nums2.length; i++) {
            while (!q.isEmpty() && q.peek() < nums2[i]) map.put(q.pop(), nums2[i]);
            q.add(nums2[i]);
        }
        while (!q.isEmpty()) map.put(q.pop(), -1);

        int[] ret = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) ret[i] = map.get(nums1[i]);
        return ret;
    }
}
