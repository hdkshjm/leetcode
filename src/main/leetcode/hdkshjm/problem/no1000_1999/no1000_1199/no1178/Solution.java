package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1178;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private int createBitMask(char c) {
        return 1 << (c - 'a');
    }

    private int createBitMask(String s) {
        int ret = 0;
        for (char c : s.toCharArray()) ret = ret | createBitMask(c);
        return ret;
    }

    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        int[] puzzleBitMasks = new int[puzzles.length];
        for (int i = 0; i < puzzles.length; i++) puzzleBitMasks[i] = createBitMask(puzzles[i]);

        int[] wordBitMasks = new int[words.length];
        for (int j = 0; j < words.length; j++) wordBitMasks[j] = createBitMask(words[j]);


        //o(n * m)で遅い
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < puzzleBitMasks.length; i++) {
            int count = 0;
            wordLabel:
            for (int j = 0; j < wordBitMasks.length; j++) {
                int temp = createBitMask(puzzles[i].charAt(0));
                if ((wordBitMasks[j] & temp) != temp) continue wordLabel;
                if ((puzzleBitMasks[i] & wordBitMasks[j]) != wordBitMasks[j]) continue wordLabel;
                count++;
            }
            ret.add(count);
        }
        return ret;
    }
}
