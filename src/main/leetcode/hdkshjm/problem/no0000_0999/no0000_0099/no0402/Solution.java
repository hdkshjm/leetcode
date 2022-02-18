package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0402;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String removeKdigits(String num, int k) {
        if (k == 0) return num;
        if (num.length() <= k) return "0";

        List<Character> list = new ArrayList<>();
        for (char n : num.toCharArray()) list.add(n);
        list.add((char) ('0' - 1));

        int i = 0;
        while (k > 0) {
            if (list.get(i) > list.get(i + 1)) {
                list.remove(i);
                if (i > 0) i--;
                k--;
            } else i++;
        }
        list.remove(list.size() - 1);

        StringBuilder sb = new StringBuilder();
        while ( list.size() > 1 && list.get(0) == '0') list.remove(0);
        for (char n : list) sb.append(n);
        return sb.toString();
    }
}
