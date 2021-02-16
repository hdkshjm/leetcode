package leetcode.hdkshjm.challenge.year2021.month02.week3.chap3642;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCasePermutation(String S) {
        char[] array = S.toLowerCase().toCharArray();
        int numOfPatterns = 1;
        for (char c : array) if (Character.isLetter(c)) numOfPatterns *= 2;

        List<String> ret = new ArrayList<>();
        ret.add(String.valueOf(array));
        numOfPatterns--;
        while (numOfPatterns > 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                if (Character.isDigit(array[i])) continue;
                if (Character.isLowerCase(array[i])) {
                    array[i] = Character.toUpperCase(array[i]);
                    break;
                }
                array[i] = Character.toLowerCase(array[i]);
            }
            ret.add(String.valueOf(array));
            numOfPatterns--;
        }
        return ret;
    }
}
