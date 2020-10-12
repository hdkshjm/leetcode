package leetcode.hdkshjm.month11.week2.chap3491;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class Solution {
    String returnWord = null;
    Map<Integer, Map<Character, Integer>> cache = new HashMap<Integer, Map<Character, Integer>>();

    public String removeDuplicateLetters(String s) {
        TreeSet<Character> set = new TreeSet<Character>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        String unDuplicateS = new String();
        for (char c : set) {
            unDuplicateS = unDuplicateS + c;
        }
        String word = new String();

        find(s, unDuplicateS, word);

        return returnWord;
    }

    public boolean isIncluded(String s, int fromIndex, String word) {
        Map<Character, Integer> map = cache.get(fromIndex);
        if (map == null) {
            map = new HashMap<Character, Integer>();
            cache.put(fromIndex, map);
        }
        int index;
        if (map.containsKey(word.charAt(0))) {
            index = map.get(word.charAt(0));
        } else {
            index = s.indexOf(word.charAt(0), fromIndex);
            map.put(word.charAt(0), index);
        }

        if (index == -1 || index >= s.length()) {
            return false;
        } else {
            if (word.length() > 1) {
                return isIncluded(s, index + 1, word.substring(1));
            } else {
                return true;
            }
        }
    }

    public void find(String s, String unDuplicateS, String word) {
        if (returnWord != null) {
            return;
        }

        if (unDuplicateS.length() <= 1) {
            String w = word + unDuplicateS;

            boolean result = isIncluded(s, 0, w);
            if (result)
                returnWord = w;
            return;
        } else {
            for (int i = 0; i < unDuplicateS.length(); i++) {
                find(
                        s,
                        unDuplicateS.substring(0, i) + unDuplicateS.substring(i + 1, unDuplicateS.length()),
                        word + unDuplicateS.charAt(i)
                );
            }
        }
    }
}
