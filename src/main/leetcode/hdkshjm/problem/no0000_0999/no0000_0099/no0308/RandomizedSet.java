package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0308;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet {
    private List<Integer> list;
    private Map<Integer, Integer> map;
    Random rand = new Random();

    public RandomizedSet() {
        this.list = new ArrayList<>();
        this.map = new HashMap<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        list.add(val);
        map.put(val, val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        // ここれでList.remove(value) すると、O(n) のため実行時間が 125msになる
        map.remove((Integer) val);
        return true;
    }

    public int getRandom() {
        int index = rand.nextInt(list.size());
        // List.remove(value) はO(n)なので、RandomizedSet.removeでは行わず
        // List.remove(index) はO(1)なので、ここで削除する
        while (!map.containsKey(list.get(index))) {
            list.remove(index);
            if (index >= list.size() && index > 0) index--;
        }
        return list.get(index);
    }
}
