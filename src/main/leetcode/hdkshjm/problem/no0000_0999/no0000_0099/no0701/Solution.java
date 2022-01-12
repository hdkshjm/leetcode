package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0701;

import leetcode.hdkshjm.common.TreeNode;

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        TreeNode node = root;
        while (node != null) {
            if (val < node.val) {
                if (node.left == null) {
                    node.left = new TreeNode(val);
                    break;
                } else {
                    node = node.left;
                }
            } else {
                if (node.right == null) {
                    node.right = new TreeNode(val);
                    break;
                } else {
                    node = node.right;
                }
            }
        }
        return root;
    }
}
