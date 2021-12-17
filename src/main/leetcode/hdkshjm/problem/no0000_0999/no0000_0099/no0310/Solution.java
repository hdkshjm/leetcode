package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0310;

import java.util.*;

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n <= 1) return Arrays.asList(0);
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            if (!map.containsKey(edge[0])) map.put(edge[0], new HashSet<>());
            if (!map.containsKey(edge[1])) map.put(edge[1], new HashSet<>());
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        Map<Integer, List<Integer>> heightTrees = new HashMap<>();
        int minHeight = n;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            int height = getHeight(i, map, visited);
            if (!heightTrees.containsKey(height)) heightTrees.put(height, new ArrayList<>());
            heightTrees.get(height).add(i);
            minHeight = Math.min(minHeight, height);
        }
        return heightTrees.get(minHeight);
    }

    public int getHeight(int node, Map<Integer, Set<Integer>> map, boolean[] visited) {
        int max = 0;
        visited[node] = true;
        for (int next : map.get(node)) {
            if (visited[next]) continue;
            max = Math.max(getHeight(next, map, visited), max);
        }
        visited[node] = false;
        return max + 1;
    }
}
