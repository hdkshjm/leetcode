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

        int ret = findPath(nodes, start, end, new Stack<Node>(), depth);

        return ret;
    }

    public int findPath(Node[][] nodes, Node start, Node end, Stack<Node> path, int depth) {
        if (path.contains(start)) return 0;
        if (path.size() == depth - 1 && start == end) return 1;
        if (path.size() != depth - 1 && start == end) return 0;

        path.add(start);
        int numOfPath = 0;

        int[][] direction = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        for (int k = 0; k < direction.length; k++) {
            int x = start.x + direction[k][0];
            int y = start.y + direction[k][1];
            if (0 <= x && x < nodes.length && 0 <= y && y < nodes[0].length && nodes[x][y] != null) {
                numOfPath += findPath(nodes, nodes[x][y], end, path, depth);
            }
        }
        path.pop();
        return numOfPath;
    }
}

class Node {
    int x;
    int y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
