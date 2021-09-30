package leetcode.hdkshjm.challenge.year2021.month10.week4.chap3993;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int sum = 0;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            sum += n;
        }
        int subsetTotal = sum / k;

        List<Integer> list = new ArrayList<>();
        while (!map.isEmpty()) {
            int i = map.lastKey();
            if (subsetTotal < i) return false;

            map.put(i, map.get(i) - 1);
            list.add(i);
            if (!search(map, subsetTotal, list)) return false;
            for (int n : list) {
                if (map.containsKey(n) && map.get(n) == 0) map.remove(n);
            }
            list.clear();
        }
        return true;
    }

    public boolean search(TreeMap<Integer, Integer> map, int subsetTotal, List<Integer> current) {
        int sum = 0;
        for (int n : current) sum += n;
        if (sum > subsetTotal) return false;
        if (sum == subsetTotal) return true;

        for (Integer i : map.descendingKeySet()) {
            if (sum + i > subsetTotal) continue;

            int count = map.getOrDefault(i, 0);
            if (count > 0) {
                map.put(i, count - 1);
                current.add(i);
                if (search(map, subsetTotal, current)) return true;
                current.remove(i);
                map.put(i, count);
            }
        }
        return false;
    }
}
