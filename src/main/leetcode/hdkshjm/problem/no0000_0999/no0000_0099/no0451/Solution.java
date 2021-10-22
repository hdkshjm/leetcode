package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0451;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String frequencySort(String s) {
        int[] counts = new int['z' + 1];
        for (char c : s.toCharArray()) counts[c]++;

        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 0) continue;
            StringBuilder sb = new StringBuilder();
            while (counts[i]-- > 0) sb.append((char) i);
            list.add(sb);
        }

        Collections.sort(list, (o1, o2) -> o2.length() - o1.length());
        StringBuilder ret = new StringBuilder();
        for (StringBuilder sb : list) ret.append(sb);

        return ret.toString();
    }
}
