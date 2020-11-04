package leetcode.hdkshjm.challenge.month11.week1.chap3519;

import java.util.*;

//TLE
class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (edges.length == 0) {
            List<Integer> ret = new ArrayList<>();
            ret.add(0);
            return ret;
        }

        int[][] distance = new int[n][n];

        Set<Integer>[] edgesSet = new Set[n];
        for (int i = 0; i < n; i++) {
            edgesSet[i] = new HashSet<>();
        }

        for (int[] edge : edges) {
            edgesSet[edge[0]].add(edge[1]);
            edgesSet[edge[1]].add(edge[0]);
        }
        for (int i = 0; i < n; i++) {
            Arrays.fill(distance[i], -1);
            findDistance(i, distance, edgesSet);
        }


        int minHeight[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                minHeight[i] = Math.max(minHeight[i], distance[i][j]);
            }
        }

        List<Integer> ret = new ArrayList<>();
        int min = minHeight[0] + 1;
        for (int i = 0; i < n; i++) {
            if (min > minHeight[i]) {
                min = minHeight[i];
                ret.clear();
                ret.add(i);
                continue;
            }
            if (min == minHeight[i]) {
                ret.add(i);
            }

        }
        return ret;
    }

    //BFS
    private void findDistance(int start, int[][] distance, Set<Integer>[] edgesSet) {
        Deque<Integer> q = new ArrayDeque<>();
        distance[start][start] = 0;
        q.push(start);

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int newNode : edgesSet[node]) {
                if (distance[start][newNode] != -1) {
                    distance[newNode][start] = distance[start][newNode];
                    continue;
                }
                distance[start][newNode] = distance[start][node] + 1;
                q.push(newNode);
            }
        }
    }
}
