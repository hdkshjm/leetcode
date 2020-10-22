package leetcode.hdkshjm.challenge.month10.week3.chap3501;

import java.util.*;

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Map<Node, Node> projection = new HashMap<>();
        projection.put(node, new Node(node.val));
        createCloneWithoutNeighbors(node, projection);
        for (Node src : projection.keySet()) {
            for (Node n : src.neighbors) {
                projection.get(src).neighbors.add(projection.get(n));
            }
        }

        return projection.get(node);
    }

    private void createCloneWithoutNeighbors(Node src, Map<Node, Node> projection) {
        for (Node srcNeighbor : src.neighbors) {
            if (!projection.containsKey(srcNeighbor)) {
                projection.put(srcNeighbor, new Node(srcNeighbor.val));
                createCloneWithoutNeighbors(srcNeighbor, projection);
            }
        }
    }
}
