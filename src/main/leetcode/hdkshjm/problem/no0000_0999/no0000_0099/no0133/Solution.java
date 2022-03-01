package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0133;

import java.util.*;

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Node, Node> map = new HashMap<>();
        shallowCopy(node, map);

        for (Node src : map.keySet()) for (Node next : src.neighbors) map.get(src).neighbors.add(map.get(next));
        return map.get(node);
    }

    public void shallowCopy(Node node, Map<Node, Node> map) {
        if (map.containsKey(node)) return;
        map.put(node, new Node(node.val));
        for (Node next : node.neighbors) {
            if (map.containsKey(next)) continue;
            shallowCopy(next, map);
        }
    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
