package leetcode.hdkshjm.month10.week3.chap3501;

import java.util.*;

class Solution {
    private Map<Node, Node> projection;

    public Solution(){
        projection = new HashMap<>();
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        projection.put(node, new Node(node.val));
        createCloneWithoutNeighbors(node);
        for (Node src : projection.keySet()) {
            for (Node n : src.neighbors) {
                projection.get(src).neighbors.add(projection.get(n));
            }
        }

        return projection.get(node);
    }

    private void createCloneWithoutNeighbors(Node src) {
        for (Node srcNeighbor : src.neighbors) {
            if (!projection.containsKey(srcNeighbor)) {
                projection.put(srcNeighbor, new Node(srcNeighbor.val));
                createCloneWithoutNeighbors(srcNeighbor);
            }
        }
    }
}
