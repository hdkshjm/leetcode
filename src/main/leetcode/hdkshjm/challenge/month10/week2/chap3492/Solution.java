package leetcode.hdkshjm.challenge.month10.week2.chap3492;

import java.util.Arrays;

class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        char[] aChars = A.toCharArray();
        char[] bChars = B.toCharArray();

        if (A.equals(B)) {
            char[] visited = new char[26];
            for (int i = 0; i < aChars.length; i++) {
                visited[aChars[i] - 'a']++;
                if (visited[aChars[i] - 'a'] > 1) {
                    return true;
                }
            }
            return false;
        }

        int diffCount = 0;
        char[] aVisited = new char[26];
        char[] bVisited = new char[26];
        for (int i = 0; i < aChars.length; i++) {
            aVisited[aChars[i] - 'a']++;
            bVisited[bChars[i] - 'a']++;
            if (aChars[i] != bChars[i]) {
                diffCount++;
            }
        }
        if (Arrays.equals(aVisited, bVisited) && diffCount == 2) {
            return true;
        }

        return false;
    }
}