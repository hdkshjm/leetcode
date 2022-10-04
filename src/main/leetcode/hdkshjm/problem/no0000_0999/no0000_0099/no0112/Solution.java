package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0112;

import leetcode.hdkshjm.common.TreeNode;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return hasPathSum(root, 0, targetSum);
    }

    public boolean hasPathSum(TreeNode root, int current, int targetSum) {
        if (root.left == null && root.right == null) return current + root.val == targetSum;
        if (root.left != null && hasPathSum(root.left, current + root.val, targetSum)) return true;
        if (root.right != null && hasPathSum(root.right, current + root.val, targetSum)) return true;
        return false;
    }
}
