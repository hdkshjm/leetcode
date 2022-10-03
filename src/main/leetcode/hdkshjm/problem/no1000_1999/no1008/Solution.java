package leetcode.hdkshjm.problem.no1000_1999.no1008;

import java.util.ArrayDeque;
import java.util.Deque;

import leetcode.hdkshjm.common.TreeNode;

class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        Deque<TreeNode> q = new ArrayDeque<>();
        TreeNode root = new TreeNode(preorder[0]);
        q.addFirst(root);

        for (int i = 1; i < preorder.length; i++) {
            TreeNode node = q.peekFirst();
            TreeNode child = new TreeNode(preorder[i]);
            while (!q.isEmpty() && q.peekFirst().val < child.val) node = q.pollFirst();
            if (node.val < child.val) node.right = child;
            else node.left = child;
            q.addFirst(child);
        }
        return root;
    }
}
