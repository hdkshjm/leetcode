package leetcode.hdkshjm.challenge.year2021.month02.week2.chap3639;

import java.util.Stack;

class Solution {
    public boolean isBipartite(int[][] graph) {
        Stack<Integer> stack = new Stack<>();
        //  1: visited. A group
        //  0: no visited
        // -1: visited. B group
        int[] visited = new int[graph.length];

        visited[0] = 1;
        stack.add(0);
        while (!stack.isEmpty()) {
            int index = stack.pop();
            for (int edge : graph[index]) {
                if (visited[index] == visited[edge]) return false;
                if (visited[edge] == 0) stack.add(edge);
                visited[edge] = -visited[index];
            }
            // グラフが複数ある場合
            if (stack.isEmpty()) {
                for (int i = 0; i < visited.length; i++) {
                    if (visited[i] == 0) {
                        visited[i] = 1;
                        stack.add(i);
                        break;
                    }
                }
            }
        }
        return true;
    }
}
