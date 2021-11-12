package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0404;

import leetcode.hdkshjm.common.TreeNode;

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int total = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) total = root.left.val;
        total += sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        return total;
    }
}
