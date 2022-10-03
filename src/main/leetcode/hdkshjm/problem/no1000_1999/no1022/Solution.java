package leetcode.hdkshjm.problem.no1000_1999.no1022;

import leetcode.hdkshjm.common.TreeNode;

class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return backtracking(root, 0);
    }

    public int backtracking(TreeNode root, int current) {
        int value = current * 2 + root.val;
        if (root.left == null && root.right == null) return value;

        int sum = 0;
        if (root.left != null) sum += backtracking(root.left, value);
        if (root.right != null) sum += backtracking(root.right, value);
        return sum;
    }
}
