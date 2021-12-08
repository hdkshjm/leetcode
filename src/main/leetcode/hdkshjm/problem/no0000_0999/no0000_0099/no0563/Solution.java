package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0563;

import leetcode.hdkshjm.common.TreeNode;

class Solution {
    public int findTilt(TreeNode root) {
        return findTiltAndSum(root)[0];
    }

    // int[0]:tilt, int[1]:sum
    public int[] findTiltAndSum(TreeNode root) {
        if (root == null) return new int[]{0, 0};
        int[] left = findTiltAndSum(root.left);
        int[] right = findTiltAndSum(root.right);
        return new int[]{left[0] + right[0] + Math.abs(left[1] - right[1]), root.val + left[1] + right[1]};
    }
}
