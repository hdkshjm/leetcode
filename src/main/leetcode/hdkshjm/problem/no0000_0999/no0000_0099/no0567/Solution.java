package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0567;

import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Hist = new int[26];
        int[] s2Hist = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Hist[(int) s1.charAt(i) - 'a']++;
            s2Hist[(int) s2.charAt(i) - 'a']++;
        }
        
        if (Arrays.equals(s2Hist, s1Hist)) return true;
        for (int i = s1.length(); i < s2.length(); i++) {
            s2Hist[(int) s2.charAt(i - s1.length()) - 'a']--;
            s2Hist[(int) s2.charAt(i) - 'a']++;
            if (Arrays.equals(s1Hist, s2Hist)) return true;
        }

        return false;
    }
}

