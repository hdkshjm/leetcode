package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1249;

import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> leftQueue = new ArrayDeque<Integer>();
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
