package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0923;

import java.util.*;

class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) map.put(n, map.getOrDefault(n, 0) + 1);
        List<Integer> list = new ArrayList<>(map.keySet());
        long count = 0;

        // l = m = n
        if (target % 3 == 0 && map.containsKey(target / 3)) {
            int l = target / 3;
            count += (long) map.get(l) * (map.get(l) - 1) * (map.get(l) - 2) / 6;
        }

        // l = m != n
        for (int i = 0; i < list.size(); i++) {
            int l = list.get(i);
            int n = target - l * 2;
            if (map.get(l) > 1 && l != n && map.containsKey(n)) {
                count += map.get(l) * (map.get(l) - 1) * map.get(target - l * 2) / 2;
            }
        }

        Collections.sort(list);
        // l != m != n
        for (int i = 0; i < list.size(); i++) {
            int l = list.get(i);

            for (int j = i + 1; j < list.size(); j++) {
                int m = list.get(j);
                int n = target - l - m;
                if (l != n && m != n && m < n && map.containsKey(n)) {
                    count += map.get(l) * map.get(m) * map.get(n);
                }
                if (m > n) break;
            }
        }

        return (int) (count % (long) (Math.pow(10, 9) + 7));
    }
}
