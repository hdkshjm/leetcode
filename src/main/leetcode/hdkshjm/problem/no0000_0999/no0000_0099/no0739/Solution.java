package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0739;

import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ret = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < temperatures.length; i++){
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int historyIndex = stack.pop();
                ret[historyIndex] = i - historyIndex;
            }
            stack.push(i);
        }
        return ret;
    }
}
