package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0127;

import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) return 0;

        List<Long> maskList = new ArrayList<>();
        for (int i = 0; i < wordList.size(); i++) maskList.add(createMask(wordList.get(i)));

        //DFS
        Deque<Integer> q = new ArrayDeque<>();
        long beginMask = createMask(beginWord);
        int[] dist = new int[wordList.size()];
        for (int i = 0; i < maskList.size(); i++) {
            long mask = maskList.get(i);
            if (mask != beginMask && isDifferBySingleLetter(mask, beginMask)) {
                q.addLast(i);
                dist[i] = 2;
            }
        }

        while (!q.isEmpty()) {
            int current = q.pollFirst();
            for (int next = 0; next < dist.length; next++) {
                if (dist[next] != 0) continue;
                if (!isDifferBySingleLetter(maskList.get(current), maskList.get(next))) continue;

                dist[next] = dist[current] + 1;
                q.addLast(next);
            }
        }
        return dist[wordList.indexOf(endWord)];
    }

    private long createMask(String s) {
        long mask = 0;
        for (char c : s.toCharArray()) {
            mask <<= 5;
            mask += (int) (c - 'a');
        }
        return mask;
    }

    private boolean isDifferBySingleLetter(long a, long b) {
        if (a == b) return false;
        long xor = a ^ b;
        int shift = (Long.numberOfTrailingZeros(xor)) / 5 * 5;
        return (xor >> shift) < 32;
    }
}
