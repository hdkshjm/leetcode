package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0096;

import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, Integer> map;

    Solution() {
        this.map = new HashMap<>();
        this.map.put(0, 1);
    }

    public int numTrees(int n) {
        if (this.map.containsKey(n)) return this.map.get(n);

        int num = 0;
        for (int i = 0; i <= n - 1; i++) {
            num += numTrees(i) * numTrees(n - 1 - i);
        }
        this.map.put(n, num);

        return num;
    }
}
