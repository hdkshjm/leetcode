package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0856;

class Solution {
    public int scoreOfParentheses(String s) {
        char[] array = s.toCharArray();
        return scoreOfParentheses(array, -1, array.length) / 2;
    }

    public int scoreOfParentheses(char[] array, int start, int end) {
        if (end - start == 1) return 1;

        int ret = 0;
        int next = start + 1;
        int count = 0;
        for (int i = start + 1; i < end; i++) {
            if (array[i] == '(') count++;
            if (array[i] == ')') count--;

            if (count == 0) {
                ret += scoreOfParentheses(array, next, i);
                next = i + 1;
            }
        }
        return ret * 2;
    }
}
