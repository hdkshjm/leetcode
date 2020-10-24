package leetcode.hdkshjm.challenge.month10.week4.chap3506;

import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);

        int score = 0;
        int start = 0;
        int end = tokens.length - 1;
        while (end >= start) {
            if (tokens[start] <= P) {
                P -= tokens[start];
                start++;
                score += 1;
                continue;
            }
            if (score == 0 || end == start) {
                break;
            }
            if (tokens[end] + P > tokens[start]) {
                P += tokens[end];
                end--;
                score -= 1;
                continue;
            }
        }
        return score;
    }
}
