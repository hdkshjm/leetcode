package leetcode.hdkshjm.problem.no1000_1999.no1249;

import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> rights = new HashSet<>();
        Set<Integer> lefts = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                lefts.add(i);
                stack.addLast(i);
                continue;
            }

            if (chars[i] == ')') {
                if (stack.isEmpty()) rights.add(i);
                else lefts.remove(stack.pollLast());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (lefts.contains(i) || rights.contains(i)) continue;
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
