package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0316;

import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> lastIndices = new HashMap<>();
        for (int i = 0; i < s.length(); i++) lastIndices.put(s.charAt(i), i);

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.contains(c)) {
                while (!stack.isEmpty() && c < stack.peek() && i < lastIndices.get(stack.peek())) stack.pop();
                stack.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return sb.toString();
    }
}
