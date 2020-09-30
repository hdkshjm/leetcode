package leetcode.hdkshjm.september.week5.chap3477;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> subStrings = new ArrayList<String>();

    public boolean wordBreak(String s, List<String> wordDict) {
        subStrings.add(s);
        while (subStrings.size() > 0) {
            String subString = subStrings.get(0);
            List<String> strings = getSubStrings(subString, wordDict);
            if (strings.contains("")) {
                return true;
            }
            subStrings.remove(0);
            subStrings.addAll(strings);
        }
        return false;
    }


    public List<String> getSubStrings(String s, List<String> wordDict) {
        List<String> ret = new ArrayList<String>();
        for (String word : wordDict) {
            if (s.indexOf(word) == 0) {
                String subString = s.substring(word.length());
                if (!subStrings.contains(subString)) {
                    ret.add(subString);
                }
            }
        }
        return ret;
    }
}
