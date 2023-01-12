package leetcode.hdkshjm.problem.no1000_1999.no1443;


import java.util.*;

class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];

            map.computeIfAbsent(x, value -> new ArrayList<>()).add(y);
            map.computeIfAbsent(y, value -> new ArrayList<>()).add(x);
        }
        
        return dfs(0, Integer.MIN_VALUE, map, hasApple);
    }

    public int dfs(int node, int parent, Map<Integer, List<Integer>> map, List<Boolean> hasApple) {
        if (!map.containsKey(node)) return 0;

        int totalTime = 0;
        for (int child : map.get(node)) {
            if (child == parent) continue;
            int childTime = dfs(child, node, map, hasApple);
            if (childTime > 0 || hasApple.get(child)) totalTime += childTime + 2;
        }
        return totalTime;
    }
}
