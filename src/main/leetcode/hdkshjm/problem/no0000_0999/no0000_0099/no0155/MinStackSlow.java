package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0155;

import java.util.PriorityQueue;
import java.util.Stack;

class MinStackSlow {
    PriorityQueue<Integer> q;
    Stack<Integer> stack;

    public MinStackSlow() {
        q = new PriorityQueue<>();
        stack = new Stack<>();
    }

    public void push(int val) {
        q.add(val);
        stack.push(val);
    }

    public void pop() {
        int val = stack.pop();
        q.remove((Integer) val);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return q.peek();
    }

}

