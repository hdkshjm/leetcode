package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0438;


import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pCount = new int[26];
        for (char c : p.toCharArray()) pCount[c - 'a']++;

        int[] sCount = new int[26];
        char[] array = s.toCharArray();
        int length = p.length();

        List<Integer> ret = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            sCount[array[i] - 'a']++;
            if (i >= length) sCount[array[i - length] - 'a']--;
            if (Arrays.equals(sCount, pCount)) ret.add(i - length + 1);
        }

        return ret;
    }
}
