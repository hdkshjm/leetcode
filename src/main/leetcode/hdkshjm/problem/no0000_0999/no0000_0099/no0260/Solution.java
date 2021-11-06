package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0260;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) set.remove(n);
            else set.add(n);
        }
        int[] ret = new int[2];
        int i = 0;
        for (int n : set) ret[i++] = n;
        return ret;
    }
}
