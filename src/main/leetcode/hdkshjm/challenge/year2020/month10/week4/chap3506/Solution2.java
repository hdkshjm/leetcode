package leetcode.hdkshjm.challenge.year2020.month10.week4.chap3506;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.Collectors;

//Runtime: 10 ms
//Memory Usage: 38.7 MB
class Solution2 {
    public int bagOfTokensScore(int[] tokens, int P) {
        Deque<Integer> q = new ArrayDeque<>(Arrays.stream(tokens).sorted().boxed().collect(Collectors.toList()));

        int score = 0;
        while (!q.isEmpty()) {
            if (q.peekFirst() <= P) {
                P -= q.pollFirst();
                score += 1;
                continue;
            }
            if (q.peekFirst() > P) {
                if (q.size() == 1 || score == 0) {
                    break;
                }
                if (q.peekLast() + P > q.peekFirst()) {
                    P += q.pollLast();
                    score -= 1;
                    continue;
                }
            }
        }
        return score;
    }
}
