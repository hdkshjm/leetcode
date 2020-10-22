package leetcode.hdkshjm.challenge.month10.week3.chap3498;

import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() < 10) {
            return Arrays.asList();
        }

        Map<Character, Integer> npToInt = new HashMap<>() {{
            put('A', 0);
            put('C', 1);
            put('T', 2);
            put('G', 3);
        }};

        char[] chars = s.toCharArray();
        int[] nums = new int[s.length()];
        for (int i = 0; i < chars.length; i++) nums[i] = npToInt.get(chars[i]);

        Set<String> ret = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        int value = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i < 10) {
                value = value << 2;
                value = value + nums[i];
                if (i == 9) set.add(value);
                continue;
            }
            value = (value << 2) - (nums[i - 10] << 20) + nums[i];
            if (set.contains(value)) {
                ret.add(s.substring(i - 9, i + 1));
            } else {
                set.add(value);
            }
        }
        return new ArrayList<>(ret);
    }
}