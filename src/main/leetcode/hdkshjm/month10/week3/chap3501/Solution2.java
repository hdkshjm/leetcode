package leetcode.hdkshjm.month10.week3.chap3501;

import java.util.HashMap;
import java.util.Map;

class Solution2 {
    Map<Integer, Node> srcMap = new HashMap<>();
    Map<Integer, Node> toMap = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        srcMap.put(node.val, node);
        toMap.put(node.val, new Node(node.val));

        shallowCopy(node);
        for (Node src : srcMap.values()) {
            for (Node n : src.neighbors) {
                toMap.get(src.val).neighbors.add(toMap.get(n.val));
            }
        }

        return toMap.get(node.val);
    }

    public void shallowCopy(Node src) {
        for (Node srcNeighbor : src.neighbors) {
            if (!srcMap.containsKey(srcNeighbor.val)) {
                srcMap.put(srcNeighbor.val, srcNeighbor);
                toMap.put(srcNeighbor.val, new Node(srcNeighbor.val));
                shallowCopy(srcNeighbor);
            }
        }
    }
}
