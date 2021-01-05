package leetcode.hdkshjm.challenge.year2020.month10.week4.chap3506;

import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);

        int score = 0;
        int start = 0;
        int end = tokens.length - 1;
        while (end >= start) {
            if (tokens[start] <= P) {
                P -= tokens[start++];
                score++;
                continue;
            }
            if (score == 0 || end == start) break;
            P += tokens[end--];
            score--;
        }
        return score;
    }
}
