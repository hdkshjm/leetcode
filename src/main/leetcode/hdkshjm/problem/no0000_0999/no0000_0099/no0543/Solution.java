package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0543;

class Solution {
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        return diameter;
    }

    public int getDepth(TreeNode root) {
        int leftDepth = 0;
        if (root.left != null) {
            leftDepth = getDepth(root.left) + 1;
        }

        int rightDepth = 0;
        if (root.right != null) {
            rightDepth = getDepth(root.right) + 1;
        }

        diameter = Math.max(diameter, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth);
    }
}
