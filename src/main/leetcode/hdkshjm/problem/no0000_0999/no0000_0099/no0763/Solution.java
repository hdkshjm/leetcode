package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0763;

import java.util.*;

class Solution {
    public List<Integer> partitionLabels(String s) {
        int[][] terms = new int[2][26];
        Arrays.fill(terms[0], -1);
        Arrays.fill(terms[1], -1);
        for (int i = 0; i < s.length(); i++) {
            int index = (int) (s.charAt(i) - 'a');
            if (terms[0][index] == -1) terms[0][index] = i;
            terms[1][index] = i;
        }

        List<Integer> ret = new ArrayList<>();
        int start = 0;
        while (start < s.length()) {
            int end = getPartitionEnd(s, start, terms);
            ret.add(end - start + 1);
            start = end + 1;
        }
        return ret;
    }

    public int getPartitionEnd(String s, int start, int[][] terms) {
        int end = terms[1][(int) (s.charAt(start) - 'a')];
        int previous = end - 1;
        while (previous != end) {
            previous = end;
            for (int i = 0; i < terms[1].length; i++) {
                if (start < terms[0][i] && terms[0][i] < end) end = Math.max(end, terms[1][i]);
            }
        }
        return end;
    }
}
