package leetcode.hdkshjm.month10.week2.chap3491;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    Map<Character, Integer> countMap = new HashMap<Character, Integer>();

    public String removeDuplicateLetters(String s) {
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                countMap.put(c, countMap.get(c) - 1);
                continue;
            }

            if (!stack.contains(c)) {
                while (!stack.isEmpty() && c < stack.peek()) {
                    if (countMap.get(stack.peek()) > 0) {
                        stack.pop();
                    } else {
                        break;
                    }
                }
                stack.push(c);
            }
            countMap.put(c, countMap.get(c) - 1);
        }

        StringBuffer ret = new StringBuffer();
        for (Character c : new ArrayList<>(stack)) {
            ret.append(c);
        }
        return ret.toString();
    }
}