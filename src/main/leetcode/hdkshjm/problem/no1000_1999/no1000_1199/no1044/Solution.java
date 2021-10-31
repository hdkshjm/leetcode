package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1044;


import java.util.*;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String longestDupSubstring(String s) {
        Map<String, List<Integer>> map = new HashMap<>();

        char[] array = s.toCharArray();
        String longestWord = "";

        // Stringは遅いので、charの配列とか使いたいけど、immutableじゃないとkeyにつかえない。。。
        for (int i = 0; i < array.length; i++) {
            String key = String.valueOf(array[i]);
            if (!map.containsKey(key)) map.put(key, new ArrayList<Integer>());
            map.get(key).add(i);
            longestWord = key;
        }
        for (Iterator<String> ite = map.keySet().iterator(); ite.hasNext(); )
            if (map.get(ite.next()).size() <= 1) ite.remove();

        if (map.isEmpty()) return "";

        while (!map.isEmpty()) {
            Map<String, List<Integer>> newMap = new HashMap<>();
            for (String word : map.keySet()) {
                List<Integer> list = map.get(word);
                if (list.size() <= 1) continue;
                for (int i = 0; i < list.size(); i++) {
                    for (int j = i + 1; j < list.size(); j++) {
                        if (list.get(i) + word.length()  < array.length
                                && list.get(j) + word.length()  < array.length
                                && array[list.get(i) + word.length()  ] ==
                                array[list.get(j) + word.length()  ]) {
                            longestWord = word + array[list.get(i) + word.length()  ];
                            if (!newMap.containsKey(longestWord)) newMap.put(longestWord, new ArrayList<Integer>());

                            List<Integer> newDuplicateList = newMap.get(longestWord);
                            if (!newDuplicateList.contains(list.get(i))) newDuplicateList.add(list.get(i));
                            newDuplicateList.add(list.get(j));
                            break;
                        }
                    }
                }
            }

            for (Iterator<String> ite = newMap.keySet().iterator(); ite.hasNext(); )
                if (newMap.get(ite.next()).size() <= 1) ite.remove();

            map = newMap;
        }
        return longestWord;
    }
}
