package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0337;

import leetcode.hdkshjm.common.TreeNode;

class Solution {
    public int rob(TreeNode root) {
        int[] money = robFromNode(root);
        return Math.max(money[0], money[1]);
    }

    // 返り値 0: 次回盗む, 1:今回盗む
    public int[] robFromNode(TreeNode node) {
        if (node == null) return new int[]{0, 0};

        int[] left = robFromNode(node.left);
        int[] right = robFromNode(node.right);

        int currentRob = node.val + left[1] + right[1];
        int skipRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return new int[]{currentRob, skipRob};
    }
}
