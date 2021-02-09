package leetcode.hdkshjm.challenge.year2021.month02.week2.chap3634;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public TreeNode convertBST(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        int total = find(root, q);
        int sum = 0;
        for (TreeNode node : q) {
            int val = node.val;
            node.val = total - sum;
            sum += val;
        }
        return root;
    }
    
    private int find(TreeNode node, Deque<TreeNode> q) {
        if (node == null) return 0;
        int total = node.val;
        total += find(node.left, q);
        q.addLast(node);
        total += find(node.right, q);
        return total;
    }
}
