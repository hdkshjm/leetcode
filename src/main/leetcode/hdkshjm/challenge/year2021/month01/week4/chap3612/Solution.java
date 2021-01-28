package leetcode.hdkshjm.challenge.year2021.month01.week4.chap3612;

class Solution {
    public boolean isOneEditDistance(String s, String t) {
        if (s.length() - t.length() > 1 || s.length() - t.length() < -1) return false;

        if (s.length() == t.length()) {
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            int count = 0;
            for (int i = 0; i < sArray.length; i++) {
                if (sArray[i] != tArray[i]) count++;
                if (count > 1) {
                    return false;
                }
            }
            return count == 1 ? true : false;
        }

        char[] shortArray;
        char[] longArray;
        if (s.length() + 1 == t.length()) {
            shortArray = s.toCharArray();
            longArray = t.toCharArray();
        } else {
            shortArray = t.toCharArray();
            longArray = s.toCharArray();
        }
        int shift = 0;
        for (int i = 0; i < shortArray.length; i++) {
            if (shortArray[i] != longArray[i + shift]) {
                if (shift == 0) {
                    shift = 1;
                    i--;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}