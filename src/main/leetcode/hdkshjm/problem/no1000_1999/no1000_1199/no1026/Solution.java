package leetcode.hdkshjm.problem.no1000_1999.no1000_1199.no1026;

import leetcode.hdkshjm.common.TreeNode;

class Solution {
    int max = 0;

    public int maxAncestorDiff(TreeNode root) {
        back(root);
        return max;
    }

    // return new int[]{low, high}
    public int[] back(TreeNode root) {
        int low = root.val;
        int high = root.val;

        if (root.left != null) {
            int[] left = back(root.left);
            low = Math.min(low, left[0]);
            high = Math.max(high, left[1]);
        }
        if (root.right != null) {
            int[] right = back(root.right);
            low = Math.min(low, right[0]);
            high = Math.max(high, right[1]);
        }
        max = Math.max(max, root.val - low);
        max = Math.max(max, high - root.val);
        return new int[]{low, high};
    }
}
