package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0797;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        find(0, graph, paths, new ArrayList<>());
        return paths;
    }

    public void find(int node, int[][] graph, List<List<Integer>> paths, List<Integer> visited) {
        visited.add(node);
        if (node == graph.length - 1) paths.add(new ArrayList<>(visited));
        else for (int next : graph[node]) find(next, graph, paths, visited);
        visited.remove(visited.size() - 1);
    }
}
