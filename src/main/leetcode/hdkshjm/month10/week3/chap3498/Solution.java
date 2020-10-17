package leetcode.hdkshjm.month10.week3.chap3498;

import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() < 10) {
            return Arrays.asList();
        }

        Set<String> set = new HashSet<>();
        Set<String> ret = new HashSet<>();
        char[] chars = s.toCharArray();
        StringBuffer sb = new StringBuffer(" " + s.substring(0, 9));
        for (int i = 9; i < chars.length; i++) {
            sb.deleteCharAt(0);
            sb.append(chars[i]);
            if (set.contains(sb.toString())) {
                ret.add(sb.toString());
            } else {
                set.add(sb.toString());
            }
        }

        return new ArrayList<>(ret);
    }
}
