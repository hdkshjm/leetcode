package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0662;

import leetcode.hdkshjm.common.TreeNode;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Map;

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        ArrayDeque<Map.Entry<TreeNode, Integer>> q = new ArrayDeque<>();

        q.addLast(new AbstractMap.SimpleEntry<TreeNode, Integer>(root, 0));
        Map.Entry end = new AbstractMap.SimpleEntry<TreeNode, Integer>(new TreeNode(101), 0);
        q.addLast(end);
        int max = 1;
        while (q.size() != 1) {
            Map.Entry<TreeNode, Integer> current = q.pollFirst();
            if (current == end) {
                int leftIndex = q.peekFirst().getValue();
                int rightIndex = q.peekLast().getValue();
                max = Math.max(max, rightIndex - leftIndex + 1);
                q.addLast(end);
                continue;
            }

            TreeNode node = current.getKey();
            Integer index = current.getValue();
            if (node.left != null)
                q.addLast(new AbstractMap.SimpleEntry<TreeNode, Integer>(node.left, index * 2));
            if (node.right != null)
                q.addLast(new AbstractMap.SimpleEntry<TreeNode, Integer>(node.right, index * 2 + 1));

        }
        return max;
    }

    //TLE
    public int widthOfBinaryTreeSlow(TreeNode root) {
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        TreeNode end = new TreeNode(101);
        TreeNode nullNode = new TreeNode(101);

        q.addLast(root);
        q.addLast(end);
        int max = 1;
        while (q.size() != 1) {
            TreeNode node = q.pollFirst();
            if (node == end) {
                while (q.peekFirst() == nullNode) q.pollFirst();
                while (q.peekLast() == nullNode) q.pollLast();
                max = Math.max(q.size(), max);
                q.addLast(end);
                continue;
            }
            if (node.left == null) q.addLast(nullNode);
            else q.addLast(node.left);

            if (node.right == null) q.addLast(nullNode);
            else q.addLast(node.right);
        }
        return max;
    }
}
