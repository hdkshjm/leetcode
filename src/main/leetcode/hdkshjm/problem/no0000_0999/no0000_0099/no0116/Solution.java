package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0116;

import java.util.LinkedList;

class Solution {
    //0ms
    public Node connect(Node root) {
        if (root == null) return root;
        if (root.left != null) root.left.next = root.right;
        if (root.right != null && root.next != null) root.right.next = root.next.left;
        connect(root.left);
        connect(root.right);
        return root;
    }

    // 4ms
    public Node connectSlow(Node root) {
        if (root == null) return root;
        LinkedList<Node> list = new LinkedList<>();
        list.add(root);
        list.add(null);
        while (list.size() > 1) {
            Node node = list.poll();
            if(node == null) {
                list.add(null);
                continue;
            }
            node.next = list.peek();
            if (node.left != null) list.add(node.left);
            if (node.right != null) list.add(node.right);
        }
        return root;
    }
}
