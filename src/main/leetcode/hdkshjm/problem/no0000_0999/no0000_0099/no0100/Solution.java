package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0100;

import leetcode.hdkshjm.common.TreeNode;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null) {
            if (q == null) return true;
            return false;
        }

        if (q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
