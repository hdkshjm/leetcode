package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0952;

import java.util.*;

class Solution {
    public int largestComponentSize(int[] nums) {
        // O(n^2) なので、これじゃないはず
        Node pre = new Node(100001);
        for (int n : nums) pre.children.add(new Node(n));
        for (int i = 0; i < pre.children.size() - 1; i++) {
            for (int j = i + 1; j < pre.children.size(); j++) {
                if (isCoprime(pre.children.get(i).val, pre.children.get(j).val)) {
                    pre.children.get(i).children.add(pre.children.get(j));
                    pre.children.get(j).children.add(pre.children.get(i));
                }
            }
        }

        //ここも遅い
        Set<Node> visited = new HashSet<>();
        int max = find(pre, visited);

        return max - 1;
    }

    //ここも遅い
    private int find(Node node, Set<Node> visited) {
        int max = 0;
        for (Node child : node.children) {
            if (visited.contains(child)) continue;
            visited.add(child);
            max = Math.max(max, find(child, visited));
            visited.remove(child);
        }

        return max + 1;
    }

    private int getCommonfactor(int a, int b) {
        if (b == 0) return a;
        else return getCommonfactor(b, a % b);
    }

    private boolean isCoprime(int a, int b) {
        return getCommonfactor(a, b) != 1;
    }
}

class Node {
    public int val;
    public boolean isEnd;
    public List<Node> children;

    public Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}
