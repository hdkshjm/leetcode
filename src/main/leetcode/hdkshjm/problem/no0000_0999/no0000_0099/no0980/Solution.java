package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0980;

import java.util.Stack;

class Solution {
    public int uniquePathsIII(int[][] grid) {
        Node start = null;
        Node end = null;
        int depth = 0;
        Node[][] nodes = new Node[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == -1) continue;
                nodes[i][j] = new Node(i, j);
                if (grid[i][j] == 1) start = nodes[i][j];
                if (grid[i][j] == 2) end = nodes[i][j];
                depth++;
            }
        }

        int[][] direction = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                for (int k = 0; k < direction.length; k++) {
                    int x = i + direction[k][0];
                    int y = j + direction[k][1];
                    if (0 <= x && x < grid.length && 0 <= y && y < grid[0].length && nodes[i][j] != null) {
                        nodes[i][j].neighbors[k] = nodes[x][y];
                    }
                }
            }
        }

        int ret = findPath(grid, start, end, new Stack<Node>(), depth);

        return ret;
    }

    public int findPath(int[][] grid, Node start, Node end, Stack<Node> path, int depth) {
        if (path.contains(start)) return 0;
        if (path.size() == depth - 1 && start == end) return 1;

        path.add(start);
        int numOfPath = 0;
        for (Node node : start.neighbors) {
            if (node == null) continue;
            numOfPath += findPath(grid, node, end, path, depth);
        }
        path.pop();
        return numOfPath;
    }
}

class Node {
    Node[] neighbors;
    int x;
    int y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
        this.neighbors = new Node[4];
    }
}
