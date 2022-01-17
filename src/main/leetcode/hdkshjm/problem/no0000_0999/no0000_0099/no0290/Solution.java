package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0290;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverse = new HashMap<>();
        int i = 0;
        for (char c : pattern.toCharArray()) {
            if (!map.containsKey(c)) {
                if (reverse.containsKey(words[i])) return false;
                map.put(c, words[i]);
                reverse.put(words[i], c);
            } else if (!map.get(c).equals(words[i]) || reverse.get(words[i]) != c) return false;
            i++;
        }
        return true;
    }
}
