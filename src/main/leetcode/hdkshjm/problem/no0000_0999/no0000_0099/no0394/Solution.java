package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0394;

import java.util.*;

class Solution {
    public String decodeString(String s) {
        char[] array = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '[') stack.push(i);
            if (array[i] == ']') map.put(stack.pop(), i);
        }
        map.put(-1, array.length);
        return decodeString(array, -1, map).toString();
    }

    public StringBuilder decodeString(char[] array, int start, Map<Integer, Integer> map) {
        StringBuilder ret = new StringBuilder();
        int num = 0;
        for (int i = start + 1; i < map.get(start); i++) {
            if (array[i] >= '0' && array[i] <= '9') {
                num = num * 10 + (int) (array[i] - '0');
                continue;
            }

            if (map.containsKey(i)) {
                StringBuilder sb = decodeString(array, i, map);
                for (int j = 0; j < num; j++) ret.append(sb);
                i = map.get(i);
                num = 0;
                continue;
            }

            ret.append(array[i]);
        }
        return ret;
    }
}
