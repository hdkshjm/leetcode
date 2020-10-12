package leetcode.hdkshjm.month10.week1.chap3483;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for (int i = 0; i < intervals.length; i++) {
            int end = map.getOrDefault(intervals[i][0], intervals[i][1]) ;
            map.put(intervals[i][0], Math.max(intervals[i][1], end));
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        Map.Entry<Integer, Integer> entry = iterator.next();
        int previousEnd = entry.getValue();

        int count = 1;
        while (iterator.hasNext()) {
            entry = iterator.next();
            if (previousEnd < entry.getValue()) {
                previousEnd = entry.getValue();
                count++;
            }
        }
        return count;
    }
}