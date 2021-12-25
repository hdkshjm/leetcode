package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0227;

import java.util.Stack;

class Solution {
    public int calculate(String s) {
        char[] array = s.toCharArray();
        int val = 0;
        char lastOperation = '+';
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (Character.isWhitespace(array[i])) continue;
            if (Character.isDigit(array[i])) {
                val = 10 * val + (int) (array[i] - '0');
                continue;
            }
            calculate(stack, val, lastOperation);
            val = 0;
            lastOperation = array[i];
        }
        calculate(stack, val, lastOperation);

        int ret = 0;
        for (int n : stack) ret += n;
        return ret;
    }

    private void calculate(Stack<Integer> stack, int val, char operation) {
        switch (operation) {
            case '+':
                stack.add(val);
                return;
            case '-':
                stack.add(-val);
                return;
            case '*':
                stack.add(stack.pop() * val);
                return;
            default:
                stack.add(stack.pop() / val);
        }
    }
}
