package leetcode.hdkshjm.challenge.year2021.month01.week3.chap3610;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    continue;
                case ')':
                    if (stack.size() == 0 || stack.pop() != '(') return false;
                    continue;
                case '}':
                    if (stack.size() == 0 || stack.pop() != '{') return false;
                    continue;
                case ']':
                    if (stack.size() == 0 || stack.pop() != '[') return false;
                    continue;
            }
        }

        if (stack.size() != 0) return false;
        return true;
    }
}
