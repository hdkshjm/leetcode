package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0129;

class Solution {
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    public int sumNumbers(TreeNode node, int upper) {
        if (node == null) return 0;
        upper = 10 * upper + node.val;
        if (node.left == null && node.right == null) return upper;
        return sumNumbers(node.left, upper) + sumNumbers(node.right, upper);
    }
}
