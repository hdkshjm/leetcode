package leetcode.hdkshjm.month11.week2.chap3487;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    Map<Integer, Integer> map;

    public TwoSum() {
        map = new HashMap<Integer, Integer>();
    }

    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }

    public boolean find(int value) {
        int target;
        for (int n : map.keySet()) {
            target = value - n;
            if ( target == n ) {
                if(map.containsKey(target) && map.get(target) > 1 ) {
                    return true;
                }
            } else {
                if (map.containsKey(target))
                    return true;
            }

        }
        return false;
    }
}
