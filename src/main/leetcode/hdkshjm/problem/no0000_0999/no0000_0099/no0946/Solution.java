package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0946;

import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0;
        int j = 0;

        Stack<Integer> stack = new Stack<>();
        while (i < pushed.length && j < popped.length) {
            if (stack.isEmpty()) {
                stack.add(pushed[i]);
                i++;
                continue;
            }

            if (stack.peek() == popped[j]) {
                stack.pop();
                j++;
                continue;
            }

            if (pushed[i] == popped[j]) {
                i++;
                j++;
                continue;
            }

            stack.add(pushed[i]);
            i++;
        }

        while (j < popped.length) {
            if (stack.pop() == popped[j]) j++;
            else return false;
        }

        return i == pushed.length && j == popped.length;
    }
}
