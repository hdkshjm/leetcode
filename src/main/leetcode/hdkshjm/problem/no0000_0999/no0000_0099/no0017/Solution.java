package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0017;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private char[][] letters = new char[][]{
            {},
            {},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
    };

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() != 0) letterCombinations(combinations, digits, 0, new StringBuilder());
        return combinations;
    }

    public void letterCombinations(List<String> combinations, String digits, int index, StringBuilder sb) {
        if (digits.length() == index) {
            combinations.add(sb.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        for (int i = 0; i < letters[digit].length; i++) {
            sb.append(letters[digit][i]);
            letterCombinations(combinations, digits, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
