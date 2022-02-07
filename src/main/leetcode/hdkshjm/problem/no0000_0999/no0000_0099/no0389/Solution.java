package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0389;

class Solution {
    public char findTheDifference(String s, String t) {
        int[] sHisto = new int[26];
        for (char c : s.toCharArray()) sHisto[c - 'a']++;

        int[] tHisto = new int[26];
        for (char c : t.toCharArray()) tHisto[c - 'a']++;

        char c = 0;
        for (int i = 0; i < tHisto.length; i++) {
            if (sHisto[i] != tHisto[i]) {
                c = (char) ('a' + i);
                break;
            }
        }
        return c;
    }
}
