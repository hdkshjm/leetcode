package leetcode.hdkshjm.challenge.year2021.month01.week3.chap3613;

import java.util.Arrays;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        int[] counts1 = new int[26];
        for (char c : word1.toCharArray()) counts1[c - 'a']++;
        int[] counts2 = new int[26];
        for (char c : word2.toCharArray()) counts2[c - 'a']++;

        for (int i = 0; i < counts1.length; i++)
            if ((counts1[i] == 0 && counts2[i] > 0) || counts1[i] > 0 && counts2[i] == 0) return false;
            
        Arrays.sort(counts1);
        Arrays.sort(counts2);
        return Arrays.equals(counts1, counts2);
    }
}
