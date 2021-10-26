package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0226;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode tmp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = tmp;

        return root;
    }
}
