package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0222;

import leetcode.hdkshjm.common.TreeNode;

class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int depth = 1;
        TreeNode left = root;
        while (left.left != null) {
            depth++;
            left = left.left;
        }

        return (int) Math.pow(2, depth) - 1 - countNullNodes(root, 1, depth);
    }

    public int countNullNodes(TreeNode root, int current, int depth) {
        if (root == null) return 1;
        if (current == depth) return 0;

        int num = countNullNodes(root.right, current + 1, depth);
        if (num > 0) num += countNullNodes(root.left, current + 1, depth);
        return num;
    }
}
