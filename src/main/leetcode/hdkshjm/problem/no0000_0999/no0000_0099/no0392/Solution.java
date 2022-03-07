package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0392;

class Solution {
    public boolean isSubsequence(String s, String t) {
        return isSubsequence(s.toCharArray(), 0, t.toCharArray(), 0);
    }

    private boolean isSubsequence(char[] s, int sIndex, char[] t, int tIndex) {
        if (sIndex == s.length) return true;

        for (int i = tIndex; i < t.length; i++) {
            if (t[i] == s[sIndex]) return isSubsequence(s, sIndex + 1, t, i + 1);
        }
        return false;
    }
}
