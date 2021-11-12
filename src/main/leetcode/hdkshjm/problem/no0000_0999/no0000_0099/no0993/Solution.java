package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0993;

import leetcode.hdkshjm.common.TreeNode;

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] depths = new int[2];
        TreeNode[] parents = new TreeNode[2];
        search(null, root, 1, x, y, depths, parents);

        return depths[0] == depths[1] && parents[0] != parents[1];
    }

    public void search(TreeNode parent, TreeNode node, int depth, int x, int y, int[] depths, TreeNode[] parents) {
        if (node == null || (depths[0] != 0 && depths[1] != 0)) return;
        if (node.val == x) {
            depths[0] = depth;
            parents[0] = parent;
        }
        if (node.val == y) {
            depths[1] = depth;
            parents[1] = parent;
        }

        search(node, node.left, depth + 1, x, y, depths, parents);
        search(node, node.right, depth + 1, x, y, depths, parents);
    }
}
