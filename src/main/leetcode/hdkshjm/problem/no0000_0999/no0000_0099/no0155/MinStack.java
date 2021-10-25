package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0155;

import java.util.ArrayList;
import java.util.List;


class MinStack {
    List<Integer> minList;
    List<Integer> list;

    public MinStack() {
        minList = new ArrayList<>();
        list = new ArrayList<>();
    }

    public void push(int val) {
        list.add(list.size(), val);
        if (minList.isEmpty() || val < minList.get(minList.size() - 1)) minList.add(minList.size(), val);
        else minList.add(minList.size(), minList.get(minList.size() - 1));
    }

    public void pop() {
        list.remove(list.size() - 1);
        minList.remove(minList.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return minList.get(minList.size() - 1);
    }
}
