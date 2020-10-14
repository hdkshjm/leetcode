package leetcode.hdkshjm.problem.minimum_remove_to_make_valid_parentheses;

import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        ArrayDeque<Integer> leftQueue = new ArrayDeque<Integer>();
        Set<Integer> removeIndexes = new HashSet<Integer>();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ')') {
                if (leftQueue.isEmpty()) {
                    removeIndexes.add(i);
                } else {
                    leftQueue.removeLast();
                }
            }
            if (chars[i] == '(') {
                leftQueue.add(i);
            }
        }

        removeIndexes.addAll(leftQueue);
        StringBuffer ret = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if (!removeIndexes.contains(i)) {
                ret.append(chars[i]);
            }
        }
        return ret.toString();
    }
}
