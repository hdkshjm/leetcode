package leetcode.hdkshjm.problem.no1000_1999.no1178;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private int createBitMask(char c) {
        return 1 << (c - 'a');
    }

    private int createBitMask(String s) {
        int ret = 0;
        for (char c : s.toCharArray()) ret |= createBitMask(c);
        return ret;
    }

    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Integer, Integer> wordBitMaskMap = new HashMap<>();
        for (int j = 0; j < words.length; j++) {
            int bitMask = createBitMask(words[j]);
            wordBitMaskMap.put(bitMask, wordBitMaskMap.getOrDefault(bitMask, 0) + 1);
        }

        List<Integer> ret = new ArrayList<>();
        for (String puzzle : puzzles) {
            int count = 0;
            int puzzleBitMask = createBitMask(puzzle);

            int firstCharBitMask = createBitMask(puzzle.charAt(0));
            // ここのiterationが最大o(n*m)になっちゃう
            for (int wordBitMask : wordBitMaskMap.keySet()) {
                if ((wordBitMask & firstCharBitMask) != firstCharBitMask) continue;
                if ((puzzleBitMask & wordBitMask) != wordBitMask) continue;
                count += wordBitMaskMap.get(wordBitMask);
            }
            ret.add(count);
        }
        return ret;
    }
}
